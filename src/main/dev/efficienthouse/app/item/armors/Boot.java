package main.dev.efficienthouse.app.item.armors;

public class Boot {
    public String name;
    public String tier;
    public int defence;
    public int durability;
    public double weight;
    public double strength;
    public double speed;
    public int kickDamage;
    public int price;

    public Boot(String newName, String newTier, int newDefence, int newDurability, double newWeight, double newStrength, double newSpeed, int newKickDamage,int newPrice) {
        name = newName;
        tier = newTier;
        defence = newDefence;
        durability = newDurability;
        weight = newWeight;
        strength = newStrength;
        speed = newSpeed;
        kickDamage = newKickDamage;
        price = newPrice;
    }
}

