package services;

import objects.attributes.StatusEffect;
import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;
import objects.items.DamageItem;

import java.util.List;

public class DamageItemService {
    PrinterService printerService = new PrinterService();
    PlayerCharacter playerCharacter;
    EnemyCharacter enemyCharacter;

    public DamageItemService (PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void handleDamageItemPlayerStatusEffect(DamageItem damageItem, int currentTurn) {
        // still needs RNG logic for effect chance

        List<StatusEffect> statusList = playerCharacter.getStatusEffects();
        StatusEffect statusEffect = damageItem.getEffectCaused();
        statusEffect.setTurnToEndOn(currentTurn + damageItem.getTurnsAffected());
        statusList.add(statusEffect);
        playerCharacter.setStatusEffects(statusList);

        System.out.println(playerCharacter.getName() + " has been affected with : " + statusEffect.getName());
        System.out.println(statusEffect.getDescription());
        printerService.anythingToContinue();
    }

    public void handleDamageItemEnemyStatusEffect(DamageItem damageItem, int currentTurn) {
        // still needs RNG logic for effect chance

        List<StatusEffect> statusList = enemyCharacter.getStatusEffects();
        StatusEffect statusEffect = damageItem.getEffectCaused();
        statusEffect.setTurnToEndOn(currentTurn + damageItem.getTurnsAffected());
        statusList.add(statusEffect);
        enemyCharacter.setStatusEffects(statusList);

        System.out.println(enemyCharacter.getName() + " has been affected with : " + statusEffect.getName());
        System.out.println(statusEffect.getDescription());
        printerService.anythingToContinue();
    }

    public boolean checkIfItemHits(DamageItem damageItem) {
        // RNG logic for if a damage item hits or not using the hit chance from damage item
        boolean hit = false;

        return hit;
    }


}
