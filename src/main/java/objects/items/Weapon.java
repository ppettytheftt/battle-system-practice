package objects.items;

import objects.attributes.ElementalType;

public class Weapon {
    private String name;
    private String weaponType; //Maybe enum as well
    private Long damage;
    private boolean magicItem;
    private ElementalType elementType;
    private int durability;
    private String rarity; //Maybe think about making rarity into an enum??

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Long getDamage() {
        return damage;
    }

    public void setDamage(Long damage) {
        this.damage = damage;
    }

    public boolean isMagicItem() {
        return magicItem;
    }

    public void setMagicItem(boolean magicItem) {
        this.magicItem = magicItem;
    }

    public ElementalType getElementType() {
        return elementType;
    }

    public void setElementType(ElementalType elementType) {
        this.elementType = elementType;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
