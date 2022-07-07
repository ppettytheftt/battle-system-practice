package services;

import objects.attributes.StatusEffect;
import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;
import objects.items.DamageItem;

import java.util.List;

public class DamageItemService {
    PrinterService printerService = new PrinterService();
    DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
    PlayerCharacter playerCharacter;
    EnemyCharacter enemyCharacter;

    public DamageItemService (PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void handleDamageItemFromPlayer(DamageItem damageItem, int currentTurn) {
        handleDamageItemEnemyStatusEffect(damageItem, currentTurn);
        boolean diceRollReturn = diceAndCoinService.determineHitForDamageItem(damageItem);

        if(diceRollReturn) {
            Long enemyHealth = enemyCharacter.getCurrentHp();
            enemyCharacter.setCurrentHp(enemyHealth - damageItem.getDamage());

            System.out.println("Your " + damageItem.getName() + " did " + damageItem.getDamage());
        }
    }

    public void handleDamageItemFromEnemy(DamageItem damageItem, int currentTurn) {
        handleDamageItemPlayerStatusEffect(damageItem, currentTurn);
        boolean diceRollReturn = diceAndCoinService.determineHitForDamageItem(damageItem);

        if(diceRollReturn) {
            Long playerHealth = playerCharacter.getCurrentHp();
            playerCharacter.setCurrentHp(playerHealth - damageItem.getDamage());

            System.out.println("Enemy " + damageItem.getName() + " did " + damageItem.getDamage());
        }
    }

    private void handleDamageItemPlayerStatusEffect(DamageItem damageItem, int currentTurn) {

        if(diceAndCoinService.determineHitForDamageItem(damageItem)) {

            List<StatusEffect> statusList = playerCharacter.getStatusEffects();
            StatusEffect statusEffect = damageItem.getEffectCaused();
            statusEffect.setTurnToEndOn(currentTurn + damageItem.getTurnsAffected());
            statusList.add(statusEffect);
            playerCharacter.setStatusEffects(statusList);

            System.out.println(playerCharacter.getName() + " has been affected with : " + statusEffect.getName());
            System.out.println(statusEffect.getDescription());
            printerService.anythingToContinue();
        } else {
            printerService.anythingToContinue();
        }
    }

    private void handleDamageItemEnemyStatusEffect(DamageItem damageItem, int currentTurn) {
        if (diceAndCoinService.determineHitForDamageItem(damageItem)) {
            List<StatusEffect> statusList = enemyCharacter.getStatusEffects();
            StatusEffect statusEffect = damageItem.getEffectCaused();
            statusEffect.setTurnToEndOn(currentTurn + damageItem.getTurnsAffected());
            statusList.add(statusEffect);
            enemyCharacter.setStatusEffects(statusList);

            System.out.println(enemyCharacter.getName() + " has been affected with : " + statusEffect.getName());
            System.out.println(statusEffect.getDescription());
            printerService.anythingToContinue();
        } else {
            printerService.anythingToContinue();
        }
    }
}
