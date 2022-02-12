package objects.items;

import objects.attributes.StatusEffect;

public class HealingItem {
    private String name;
    private boolean healthItem;
    private boolean affectsParty;
    private StatusEffect statusHeal;
    private Long amountHealed;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthItem() {
        return healthItem;
    }

    public void setHealthItem(boolean healthItem) {
        this.healthItem = healthItem;
    }

    public boolean isAffectsParty() {
        return affectsParty;
    }

    public void setAffectsParty(boolean affectsParty) {
        this.affectsParty = affectsParty;
    }

    public StatusEffect getStatusHeal() {
        return statusHeal;
    }

    public void setStatusHeal(StatusEffect statusHeal) {
        this.statusHeal = statusHeal;
    }

    public Long getAmountHealed() {
        return amountHealed;
    }

    public void setAmountHealed(Long amountHealed) {
        this.amountHealed = amountHealed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
