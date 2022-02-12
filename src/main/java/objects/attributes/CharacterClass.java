package objects.attributes;

import java.util.List;

public class CharacterClass {
    private String name;
    private String description;
    private List<String> buffedWeapons;
    private List<String> normalWeapons;
    private List<String> weakWeapons;
    private List<String> armorProficiencies;
    private boolean magicUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getBuffedWeapons() {
        return buffedWeapons;
    }

    public void setBuffedWeapons(List<String> buffedWeapons) {
        this.buffedWeapons = buffedWeapons;
    }

    public List<String> getNormalWeapons() {
        return normalWeapons;
    }

    public void setNormalWeapons(List<String> normalWeapons) {
        this.normalWeapons = normalWeapons;
    }

    public List<String> getWeakWeapons() {
        return weakWeapons;
    }

    public void setWeakWeapons(List<String> weakWeapons) {
        this.weakWeapons = weakWeapons;
    }

    public List<String> getArmorProficiencies() {
        return armorProficiencies;
    }

    public void setArmorProficiencies(List<String> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public boolean isMagicUser() {
        return magicUser;
    }

    public void setMagicUser(boolean magicUser) {
        this.magicUser = magicUser;
    }
}
