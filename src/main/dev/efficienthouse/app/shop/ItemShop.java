package main.dev.efficienthouse.app.shop;

import main.dev.efficienthouse.app.entity.hero.Warrior;
import main.dev.efficienthouse.app.item.armors.*;
import main.dev.efficienthouse.app.item.weapons.*;

import java.util.Scanner;

public class ItemShop {
    public Helmet[] helmets;
    public ChestPlate[] chestPlates;
    public Belt[] belts;
    public Boot[] boots;
    public Shield[] shields;
    public Axe[] axes;
    public Bow[] bows;
    public Sword[] swords;

    public ItemShop() {
        helmets = new Helmet[]{
                new Helmet("Cap", "Common", 5, 12, 0.8, 0, 0, 100),
                new Helmet("GreatHelm", "Rare", 25, 40, 2.3, 1.3, 0.6, 100)
        };
        chestPlates = new ChestPlate[]{
                new ChestPlate("LeatherArmor", "Common", 10, 20, 2.4, 5, 0, 100),
                new ChestPlate("LightPlate", "Rare", 50, 50, 11.2, 10, 4, 100),
        };
        belts = new Belt[]{
                new Belt("LeatherBelt", "Common", 3, 14, 0.3, 2, 0, 100),
                new Belt("HeavyBelt", "Rare", 6, 20, 1.4, 7, 0.5, 100),
        };
        boots = new Boot[]{
                new Boot("LeatherBoot", "Common", 3, 10, 0.5, 2, 0.2, 3, 100),
                new Boot("ChainBoot", "Rare", 8, 20, 1.7, 5, 2, 9, 100)
        };
        shields = new Shield[]{
                new Shield("SmallShield", "Common", 30, 25, 3.4, 10, 5, 20, 100),
                new Shield("SpikedShield", "Rare", 60, 40, 7.8, 20, 10, 40, 100),
        };
        axes = new Axe[]{
                new Axe("HandAxe", "Common", 25, 20, 2.3, false, 100),
                new Axe("ChampionAxe", "Legendary", 35, 30, 9.8, true, 100)
        };
        bows = new Bow[]{
                new Bow("LongBow", "Common", 15, 20, 2.3, 1000, 100),
                new Bow("CrossBow", "Rare", 20, 30, 4.5, 300, 100)
        };
        swords = new Sword[]{
                new Sword("LongSword", "Common", 10, 30, 3.4, false, 100),
                new Sword("WarSword", "Rare", 20, 40, 5.6, false, 100),
                new Sword("HeavySword", "Legendary", 30, 50, 8.7, true, 100),
        };
    }
    public static void printItem(Helmet helmet) {
        System.out.println("----------\n" +
                "name : " + helmet.name + "\n" +
                "tier : " + helmet.tier + "\n" +
                "defence : " + helmet.defence + "\n" +
                "durability : " + helmet.durability + "\n" +
                "weight : " + helmet.weight + "\n" +
                "strength : " + helmet.strength + "\n" +
                "speed : " + helmet.speed + "\n" +
                "price : " + helmet.price + "\n"+
                "**************");
    }
    public static void printItem(ChestPlate chestPlate) {
        System.out.println("----------\n" +
                "name : " + chestPlate.name + "\n" +
                "tier : " + chestPlate.tier + "\n" +
                "defence : " + chestPlate.defence + "\n" +
                "durability : " + chestPlate.durability + "\n" +
                "weight : " + chestPlate.weight + "\n" +
                "strength : " + chestPlate.strength + "\n" +
                "speed : " + chestPlate.speed + "\n" +
                "price : " + chestPlate.price + "\n"+
                "**************");
    }
    public static void printItem(Belt belt) {
        System.out.println("----------\n" +
                "name : " + belt.name + "\n" +
                "tier : " + belt.tier + "\n" +
                "defence : " + belt.defence + "\n" +
                "durability : " + belt.durability + "\n" +
                "weight : " + belt.weight + "\n" +
                "strength : " + belt.strength + "\n" +
                "speed : " + belt.speed + "\n" +
                "price : " + belt.price + "\n"+
                "**************");
    }
    public static void printItem(Boot boot) {
        System.out.println("----------\n" +
                "name : " + boot.name + "\n" +
                "tier : " + boot.tier + "\n" +
                "defence : " + boot.defence + "\n" +
                "durability : " + boot.durability + "\n" +
                "weight : " + boot.weight + "\n" +
                "strength : " + boot.strength + "\n" +
                "speed : " + boot.speed + "\n" +
                "kickDamage : " + boot.kickDamage + "\n" +
                "price : " + boot.price + "\n"+
                "**************");
    }
    public static void printItem(Shield shield) {
        System.out.println("----------\n" +
                "name: " + shield.name + "\n" +
                "tier: " + shield.tier + "\n" +
                "defence: " + shield.defence + "\n" +
                "durability: " + shield.durability + "\n" +
                "weight : " + shield.weight + "\n" +
                "strength : " + shield.strength + "\n" +
                "speed : " + shield.speed + "\n" +
                "block  : " + shield.block + "\n" +
                "price: " + shield.price + "\n"+
                "**************");
    }
    public static void printItem(Axe axe) {
        System.out.println("----------\n" +
                "name: " + axe.name + "\n" +
                "tier: " + axe.tier + "\n" +
                "damage: " + axe.damage + "\n" +
                "durability: " + axe.durability + "\n" +
                "weight : " + axe.weight + "\n" +
                "is One Handed ? : " + axe.isOneHanded + "\n" +
                "price: " + axe.price + "\n"+
                "**************");
    }
    public static void printItem(Bow bow) {
        System.out.println("----------\n" +
                "name: " + bow.name + "\n" +
                "tier: " + bow.tier + "\n" +
                "damage: " + bow.damage + "\n" +
                "durability: " + bow.durability + "\n" +
                "range : " + bow.range + "\n" +
                "weight : " + bow.weight + "\n" +
                "price: " + bow.price + "\n"+
                "**************");
    }

    public static void printItem(Sword sword) {
        System.out.println("----------\n" +
                "name: " + sword.name + "\n" +
                "tier: " + sword.tier + "\n" +
                "damage: " + sword.damage + "\n" +
                "durability: " + sword.durability + "\n" +
                "weight : " + sword.weight + "\n" +
                "is One Handed ? : " + sword.isOneHanded + "\n" +
                "price: " + sword.price + "\n" +
                "**************");
    }

    public void menu() {
        // System.out.println("Welcome the Item Shop ... Your Balance is = %d",warrior.balance);
        boolean exit = false;
        while(!exit){
            System.out.println("What would you like to buy ? for Armors type 1 ,for Weapons type 2 ,for exit type 0");
            Scanner kb = new Scanner(System.in);
            int choosing = kb.nextInt();
            switch (choosing) {
                case 1:
                    getArmors();
                    break;
                case 2:
                    getWeapons();
                    break;
                case 0 :
                    exit = true;
                    break;
                default:
                    System.out.println("You made the wrong choice. Try Again!");
                    break;
            }
        }
    }
    public void getArmors() {
        Scanner kb = new Scanner(System.in);
        boolean back = false;
        while(!back){
            System.out.println("1-Helmets \n" +
                    "2-ChestPlates  \n" +
                    "3-Belts \n" +
                    "4-Boots \n" +
                    "5-Shields \n"+
                    "0-Back to the Main Menu");
            int choosing = kb.nextInt();
            switch (choosing) {
                case 1:
                    printItem(helmets[0]);
                    printItem(helmets[1]);
                    break;
                case 2:
                    printItem(chestPlates[0]);
                    printItem(chestPlates[1]);
                    break;
                case 3:
                    printItem(belts[0]);
                    printItem(belts[1]);
                    break;
                case 4:
                    printItem(boots[0]);
                    printItem(boots[1]);
                    break;
                case 5:
                    printItem(shields[0]);
                    printItem(shields[1]);
                    break;
                case 0 :
                    back = true;
                    break;
                default:
                    System.out.println("You made the wrong choice. Try Again!");
                    break;
            }
        }
    }
    public void getWeapons() {
        boolean back = false;
        Scanner kb = new Scanner(System.in);
        while(!back){
        System.out.println("1-Axes \n" +
                "2-Bows \n" +
                "3-Swords\n" +
                "0-Back to the Main Menu");
        int choosing = kb.nextInt();
            switch (choosing) {
                case 1:
                    printItem(axes[0]);
                    printItem(axes[1]);
                    break;
                case 2:
                    printItem(bows[0]);
                    printItem(bows[1]);
                    break;
                case 0:
                    back = true;
                    break;
                case 3:
                    printItem(swords[0]);
                    printItem(swords[1]);
                    printItem(swords[2]);
                    break;
                default:
                    System.out.println("You made the wrong choice. Try Again!");
                    break;
            }
        }
    }
}

