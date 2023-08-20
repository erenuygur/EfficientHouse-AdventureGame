package main.dev.efficienthouse.app.item.weapons;

import java.util.Random;

public class Axe {
    public String name;
    public String tier;
    public boolean isOneHanded;
    public int minDamage;
    public int maxDamage;
    public int durability;
    public int range;
    public double weight;

    public Axe(String newName, String newTier, boolean newOneHand, int newMinDamage, int newMaxDamge, int newDurability, int newRange, double newWeight) {
        name = newName;
        tier = newTier;
        isOneHanded = newOneHand;
        minDamage = newMinDamage;
        maxDamage = newMaxDamge;
        durability = newDurability;
        range = newRange;
        weight = newWeight;

    }
}

