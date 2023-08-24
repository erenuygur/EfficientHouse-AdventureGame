package main.dev.efficienthouse.app.item.armors;

public class Boot {
        public String name;
        public String tier;
        public int minDefence;
        public int maxDefence;
        public int durability;
        public int kickDamage;
        public double weight;
        public int speed;

        public Boot(String newName, String newTier, int newMinDefence, int newMaxDefence, int newDurability, int newKickDamage, double newWeight,int newSpeed) {
            name = newName;
            tier = newTier;
            minDefence = newMinDefence;
            maxDefence = newMaxDefence;
            durability = newDurability;
            kickDamage = newKickDamage;
            weight = newWeight;
            speed = newSpeed;
        }
    }

