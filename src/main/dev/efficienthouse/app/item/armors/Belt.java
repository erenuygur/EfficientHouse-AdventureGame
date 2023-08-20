package main.dev.efficienthouse.app.item.armors;

public class Belt {
        public String name;
        public String tier;
        public int minDefence;
        public int maxDefence;
        public int durability;
        public double weight;


        public Belt(String newName, String newTier, int newMinDefence, int newMaxDefence, int newDurability, double newWeight) {
            name = newName;
            tier = newTier;
            minDefence = newMinDefence;
            maxDefence = newMaxDefence;
            durability = newDurability;
            weight = newWeight;

        }
    }

