package services;

import objects.characters.EnemyCharacter;
import objects.characters.PlayerCharacter;

public class BattleService {
    private static final int DEFENSE_BONUS = 1000;
    PrinterService printerService = new PrinterService();
    PlayerCharacter playerCharacter;
    EnemyCharacter enemyCharacter;

    public BattleService(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter) {
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void playerAttack(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter){
        Long playerAttackPower = playerCharacter.getEquippedWeapon().getDamage();
        Long enemyDefensePower = enemyCharacter.getEquippedArmor().getDefensePower();
        Long enemyHealth = enemyCharacter.getCurrentHp();
        // create a method to see if an attack is successful with RNG
        boolean attackSuccessful = false;

        if (attackSuccessful) {
            enemyCharacter.setCurrentHp(enemyHealth - compareForAttack(playerAttackPower, enemyDefensePower));
        } else {
            printerService.printHeading("Your attack against " + enemyCharacter.getName() + " missed!");
        }
    }

    public void enemyAttack(PlayerCharacter playerCharacter, EnemyCharacter enemyCharacter, boolean defended){
        Long enemyAttackPower = enemyCharacter.getEquippedWeapon().getDamage();
        Long playerDefensePower = playerCharacter.getEquippedArmor().getDefensePower();
        Long playerHealth = playerCharacter.getCurrentHp();
        // create a method to see if an attack is successful with RNG

        boolean attackSuccessful = false;

        if (attackSuccessful) {
            playerCharacter.setCurrentHp(playerHealth - compareForDefense(playerDefensePower, enemyAttackPower, defended));
        } else {
            printerService.printHeading("Enemy " + enemyCharacter.getName() + " missed you while attacking!");
        }
    }

    private static Long compareForAttack(Long playerAttack, Long enemyDefense) {
        return playerAttack - enemyDefense;
    }

    private static Long compareForDefense(Long playerDefense, Long enemyAttack, boolean defended) {
        if(defended) {
            return (playerDefense + DEFENSE_BONUS) - enemyAttack;
        } else {
            return playerDefense - enemyAttack;
        }
    }
}

