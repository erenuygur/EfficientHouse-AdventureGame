package main.dev.efficienthouse.app.item.armors;

public class Shield {
    public String name;
    public String tier;
    public int defence;
    public int durability;
    public double weight;
    public int strength;
    public double speed;
    public int block;
    public int price;
    public Shield(String newName, String newTier, int newDefence, int newDurability,double newWeight,int newStrength,double newSpeed,int newBlock,int newPrice) {
        name = newName;
        tier = newTier;
        defence = newDefence;
        durability = newDurability;
        weight = newWeight;
        strength = newStrength;
        speed = newSpeed;
        block = newBlock;
        price = newPrice;
    }
}

