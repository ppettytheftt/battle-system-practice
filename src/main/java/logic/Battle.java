package logic;

import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;
import services.BattleService;
import services.PrinterService;

public class Battle {
    public void startBattle(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        boolean battleOver = false;
        PrinterService printerService = new PrinterService();
        BattleService battleService = new BattleService(playerCharacter, enemyCharacter);
        int turn = 0;


        while (!battleOver) {
            printerService.printOpenerHeading(enemyCharacter);
            boolean inTurn = true;
            while (inTurn) {
                boolean playerDefended = false;
                switch (printerService.printTurnStart(playerCharacter, enemyCharacter)) {
                    case 1:
                        battleService.playerAttack(playerCharacter, enemyCharacter);
                        battleService.enemyAttack(playerCharacter, enemyCharacter, playerDefended);
                        turn++;
                        break;

                    case 2:
                        // need magic code here

                    case 3:
                        playerDefended = true;
                        System.out.println("You've taken a defensive stance!");
                        battleService.enemyAttack(playerCharacter, enemyCharacter, playerDefended);
                        turn++;
                        break;

                    case 4:
                        // need item code here

                    case 5:
                        // need run attempt code here
                }
            }
        }
    }
}
