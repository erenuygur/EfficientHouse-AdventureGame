package main.dev.efficienthouse.app.item.armors;
public class ChestPlate {
    public String name;
    public String tier;
    public int defence;
    public double durability;
    public double weight;
    public double strength;
    public double speed;
    public int price;

    public ChestPlate(String newName, String newTier, int newDefence, double newDurability, double newWeight,double newStrength,double newSpeed,int newPrice) {
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

