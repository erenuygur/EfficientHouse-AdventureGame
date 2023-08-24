package main.dev.efficienthouse.app.item.armors;

public class ChestPlate {
    public String name;
    public String tier;
    public int minDefence;
    public int maxDefence;
    public double weight;
    public int durability;


    public ChestPlate(String newName, String newTier, int newMinDefence, int newMaxDefence, int newDurability, double newWeight) {
        name = newName;
        tier = newTier;
        minDefence = newMinDefence;
        maxDefence = newMaxDefence;
        durability = newDurability;
        weight = newWeight;

    }

}

