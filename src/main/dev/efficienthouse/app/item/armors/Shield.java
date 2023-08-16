package main.dev.efficienthouse.app.item.armors;

public class Shield {

    public String name;
    public String tier;
    public int minDefence;
    public int maxDefence;
    public int block;
    public int durability;
    public double weight;


    public Shield(String newName, String newTier, int newMinDefence, int newMaxDefence, int newDurability, int newBlock, double newWeight) {
        name = newName;
        tier = newTier;
        minDefence = newMinDefence;
        maxDefence = newMaxDefence;
        durability = newDurability;
        block = newBlock;
        weight = newWeight;

    }
}

