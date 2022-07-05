package services;

import objects.attributes.StatusEffect;
import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;

public class StatusEffectService {
    PlayerCharacter playerCharacter;
    EnemyCharacter enemyCharacter;

    public StatusEffectService(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void playerCheckStatus(int currentTurn) {
        List<StatusEffect> playerStatusEffects = playerCharacter.getStatusEffects();
        List<StatusEffect> newStatusList = new ArrayList<>();
        int i;
        for(i = 0; i < playerStatusEffects.size(); i++) {
            StatusEffect currentStatusEffect = playerStatusEffects.get(i);
            if(currentStatusEffect.getTurnToEndOn() != currentTurn) {
                newStatusList.add(currentStatusEffect);
            } else {
                System.out.println("You are no longer affected by " + currentStatusEffect.getName() + "!");
            }

        }
        playerCharacter.setStatusEffects(newStatusList);
    }

    public void enemyCheckStatus(int currentTurn) {
        List<StatusEffect> enemyStatusEffects = playerCharacter.getStatusEffects();
        List<StatusEffect> newStatusList = new ArrayList<>();
        int i;
        for(i = 0; i < enemyStatusEffects.size(); i++) {
            StatusEffect currentStatusEffect = enemyStatusEffects.get(i);
            if(currentStatusEffect.getTurnToEndOn() != currentTurn) {
                newStatusList.add(currentStatusEffect);
            } else {
                System.out.println(enemyCharacter.getName() + " is no longer affected by " + currentStatusEffect.getName() + "!");
            }
            
        }
        enemyCharacter.setStatusEffects(newStatusList);
    }
}
