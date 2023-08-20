package main.dev.efficienthouse.app.item.weapons;

public class Bow {
    public String name;
    public String tier;
    public int minDamage;
    public int maxDamage;
    public int durability;
    public int range;

    public Bow(String newName, String newTier, int newMinDamage, int newMaxDamge, int newDurability, int newRange) {
        name = newName;
        tier = newTier;
        minDamage = newMinDamage;
        maxDamage = newMaxDamge;
        durability = newDurability;
        range = newRange;

    }
}
