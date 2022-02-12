package objects.characters;

import objects.attributes.CharacterClass;
import objects.attributes.StatusEffect;
import objects.items.Armor;
import objects.items.DamageItem;
import objects.items.HealingItem;
import objects.items.Weapon;

import java.util.List;

public class EnemyCharacter {
    private String name;
    private List<StatusEffect> statusEffects;
    private Long maxHp;
    private Long currentHp;
    private Long maxMana;
    private Long currentMana;
    private CharacterClass characterClass;
    private Weapon equippedWeapon;
    private Armor equippedArmor;
    private List<DamageItem> damageItems;
    private List<HealingItem> healingItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StatusEffect> getStatusEffects() {
        return statusEffects;
    }

    public void setStatusEffects(List<StatusEffect> statusEffects) {
        this.statusEffects = statusEffects;
    }

    public Long getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Long maxHp) {
        this.maxHp = maxHp;
    }

    public Long getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Long currentHp) {
        this.currentHp = currentHp;
    }

    public Long getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(Long maxMana) {
        this.maxMana = maxMana;
    }

    public Long getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(Long currentMana) {
        this.currentMana = currentMana;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Armor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    public List<DamageItem> getDamageItems() {
        return damageItems;
    }

    public void setDamageItems(List<DamageItem> damageItems) {
        this.damageItems = damageItems;
    }

    public List<HealingItem> getHealingItems() {
        return healingItems;
    }

    public void setHealingItems(List<HealingItem> healingItems) {
        this.healingItems = healingItems;
    }
}
