package main.dev.efficienthouse.app.item.weapons;
public class Axe {
    public String name;
    public String tier;
    public boolean isOneHanded;

    public int damage;
    public int durability;
    public double weight;
    public int price;

    public Axe(String newName, String newTier, int newDamage, int newDurability, double newWeight, boolean newOneHand,int newPrice) {
        name = newName;
        tier = newTier;
        damage = newDamage;
        durability = newDurability;
        weight = newWeight;
        isOneHanded = newOneHand;
        price = newPrice;
    }

}

