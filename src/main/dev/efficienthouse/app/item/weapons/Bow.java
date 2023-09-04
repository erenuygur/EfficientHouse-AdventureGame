package main.dev.efficienthouse.app.item.weapons;

public class Bow {
    public String name;
    public String tier;

    public int damage;
    public int durability;
    public int range;
    public double weight;
    public int price;
    public Bow(String newName, String newTier, int newDamage, int newDurability, double newWeight ,int newRange,int newPrice) {
        name = newName;
        tier = newTier;
        damage = newDamage;
        durability = newDurability;
        weight = newWeight;
        range = newRange;
        price = newPrice;

    }
}
