package objects.attributes;

public class StatusEffect {
    private String name;
    private String description;
    private int turnToEndOn;

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

    public int getTurnToEndOn() {
        return turnToEndOn;
    }

    public void setTurnToEndOn(int turnToEndOn) {
        this.turnToEndOn = turnToEndOn;
    }
}
