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
        handleCharacterStatusList(playerCharacter, currentTurn);
    }

    public void enemyCheckStatus(int currentTurn) {
        handleEnemyStatusList(enemyCharacter, currentTurn);
    }

    private void handleCharacterStatusList(PlayerCharacter playerCharacter, int currentTurn) {
        List<StatusEffect> newList = new ArrayList<>();
        int i;
        for (i = 0; i < playerCharacter.getStatusEffects().size(); i++) {
            StatusEffect currentStatus = playerCharacter.getStatusEffects().get(i);
            if (currentStatus.getTurnToEndOn() != currentTurn) {
                newList.add(currentStatus);
            }
        }
        playerCharacter.setStatusEffects(newList);
    }

    private void handleEnemyStatusList(EnemyCharacter enemyCharacter, int currentTurn) {
        List<StatusEffect> newList = new ArrayList<>();
        int i;
        for (i = 0; i < enemyCharacter.getStatusEffects().size(); i++) {
            StatusEffect currentStatus = enemyCharacter.getStatusEffects().get(i);
            if (currentStatus.getTurnToEndOn() != currentTurn) {
                newList.add(currentStatus);
            }
        }
        enemyCharacter.setStatusEffects(newList);
    }
}
