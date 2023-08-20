package main.dev.efficienthouse.app.item.armors;

public class Helmet {

    public String name;
    public String tier;
    public int minDefence;
    public int maxDefence;
    public int durability;
    public int strength;
    public double weight;


    public Helmet(String newName, String newTier, int newMinDefence, int newMaxDefence, int newDurability, int newStrength, double newWeight) {
        name = newName;
        tier = newTier;
        minDefence = newMinDefence;
        maxDefence = newMaxDefence;
        durability = newDurability;
        strength = newStrength;
        weight = newWeight;

    }
}

