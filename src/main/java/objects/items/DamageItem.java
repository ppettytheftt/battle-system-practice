package objects.items;

import objects.attributes.StatusEffect;

public class DamageItem {
    private String name;
    private boolean hurtsAll;
    private StatusEffect effectCaused;
    private int effectChance;
    private Long damage;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHurtsAll() {
        return hurtsAll;
    }

    public void setHurtsAll(boolean hurtsAll) {
        this.hurtsAll = hurtsAll;
    }

    public StatusEffect getEffectCaused() {
        return effectCaused;
    }

    public void setEffectCaused(StatusEffect effectCaused) {
        this.effectCaused = effectCaused;
    }

    public int getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(int effectChance) {
        this.effectChance = effectChance;
    }

    public Long getDamage() {
        return damage;
    }

    public void setDamage(Long damage) {
        this.damage = damage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
