package main.dev.efficienthouse.app.item.weapons;

public class Sword {
    public String name;
    public String tier;
    public boolean oneHand;
    public boolean throwable;
    public int minDamage;
    public int maxDamage;

    public Sword(String newName, String newTier, boolean newOneHand, boolean newThrowable, int newMinDamage, int newMaxDamge) {
        name = newName;
        tier = newTier;
        oneHand = newOneHand;
        throwable = newThrowable;
        minDamage = newMinDamage;
        maxDamage = newMaxDamge;

    }
}

