package main.dev.efficienthouse.app.item.armors;

public class Helmet {
    public String name;
    public String tier;

    public int defence;
    public int durability;
    public double weight;
    public double strength;
    public double speed;
    public int price;
    public Helmet(String newName, String newTier, int newDefence ,int newDurability, double newWeight,double newStrength,double newSpeed,int newPrice) {
        name = newName;
        tier = newTier;
        defence = newDefence;
        durability = newDurability;
        weight = newWeight;
        strength = newStrength;
        speed = newSpeed;
        price = newPrice;

    }
}

