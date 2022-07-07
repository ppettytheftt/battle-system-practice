package logic;

import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;
import objects.items.DamageItem;
import services.BattleService;
import services.DamageItemService;
import services.PrinterService;
import services.StatusEffectService;

public class Battle {
    public void startBattleLoop(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        boolean battleOver = false;
        PrinterService printerService = new PrinterService();
        BattleService battleService = new BattleService(playerCharacter, enemyCharacter);
        DamageItemService damageItemService = new DamageItemService(playerCharacter, enemyCharacter);
        StatusEffectService statusEffectService = new StatusEffectService(playerCharacter, enemyCharacter);

        // main battle loop
        while (!battleOver) {
            int turn = 0;
            printerService.printOpenerHeading(enemyCharacter);
            boolean inTurn = true;
            while (inTurn) {
                // Player Turn
                boolean playerDefended = false;
                switch (printerService.printTurnStart(playerCharacter, enemyCharacter)) {
                    case 1:
                        battleService.playerAttack(playerCharacter, enemyCharacter);
                        break;

                    case 2:
                        // need magic code here
                        break;

                    case 3:
                        playerDefended = true;
                        System.out.println("You've taken a defensive stance!");
                        battleService.enemyAttack(playerCharacter, enemyCharacter, playerDefended);
                        break;

                    case 4:
                        System.out.println("What kind of item do you wish to use?");
                        System.out.println("  1. Damage Item");
                        System.out.println("  2. Healing Item");
                        int input = printerService.getUserNumberInput();
                        if (input == 1) {
                            printerService.printDamageItemChoices(playerCharacter.getDamageItems());
                            int playerChoice = printerService.getUserNumberInput();

                            DamageItem damageItemUsed = playerCharacter.getDamageItems().get(playerChoice);
                            System.out.println("You've used " + damageItemUsed.getName() + "...");
                            damageItemService.handleDamageItemFromPlayer(damageItemUsed, turn);
                            printerService.anythingToContinue();
                        }
                        if (input == 2) {
                            // healing item code here
                        } else {
                            System.out.println("Not a valid selection!");
                        }
                        statusEffectService.enemyCheckStatus(turn);
                        statusEffectService.playerCheckStatus(turn);
                        break;

                    case 5:
                        // need run attempt code here
                        break;
                }
                printerService.printHeading("Turn over!  " + playerCharacter.getName() + ": " + playerCharacter.getCurrentHp() + "HP left\n" +
                        "Enemy " + enemyCharacter.getName() + ": " + enemyCharacter.getCurrentHp() + "HP left");
                turn++;
                printerService.anythingToContinue();
                inTurn = false;
            }
            if (checkIfBattleOver(playerCharacter, enemyCharacter)) {
                battleOver = true;
            }
        }
    }

    private static boolean checkIfBattleOver(PlayerCharacter player, EnemyCharacter enemy) {
        if (player.getCurrentHp() <= 0 || enemy.getCurrentHp() <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
