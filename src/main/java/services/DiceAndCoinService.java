package services;

import objects.items.DamageItem;

import java.util.concurrent.ThreadLocalRandom;

public class DiceAndCoinService {

    public int flipACoin() {
        return ThreadLocalRandom.current().nextInt(1, 3);
    }

    public boolean determineHitForDamageItem(DamageItem damageItem) {
        boolean isHit = false;
        int diceRollReturn = rollDice(damageItem.getEffectChance());

        if(diceRollReturn >= 4) {
            isHit = true;
        }
        return isHit;
    }

    private int rollDice(int numberOfDiceSides) {
        int numberReturned = 0;
        switch (numberOfDiceSides) {
            case 20:
                numberReturned = ThreadLocalRandom.current().nextInt(1, 21);
                break;
            case 12:
                numberReturned = ThreadLocalRandom.current().nextInt(1, 13);
                break;
            case 10:
                numberReturned = ThreadLocalRandom.current().nextInt(1, 11);
                break;
            case 8:
                numberReturned = ThreadLocalRandom.current().nextInt(1, 9);
                break;
            case 6:
                numberReturned = ThreadLocalRandom.current().nextInt(1, 7);
                break;
            case 4:
                numberReturned = ThreadLocalRandom.current().nextInt(1, 5);
                break;
        }
        return numberReturned;
    }
}
