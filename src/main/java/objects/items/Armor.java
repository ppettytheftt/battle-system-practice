package objects.items;

import objects.attributes.ElementalType;

public class Armor {
    private String name;
    private String armorType; // Maybe enum as well
    private Long defensePower;
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

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public Long getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(Long damage) {
        this.defensePower = damage;
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
