package main.dev.efficienthouse.app.game;

import main.dev.efficienthouse.app.entity.enemy.Goblin;
import main.dev.efficienthouse.app.entity.hero.Warrior;

import java.util.Scanner;

public class GameUtil {

    public static boolean basicCombat(Warrior hero, Goblin enemy) {
        if (hero == null || enemy == null){
            System.out.println("Illegal statement of entity(ies)!");
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        boolean isWin = false;

        System.out.println("Basic Combat Starting\n\n\n\n\n\n" + showAttributes(hero, enemy));

        System.out.print("(F)ight or (R)un :");
        String playerChoice = scanner.nextLine();

        while ((playerChoice.equalsIgnoreCase("f") || playerChoice.equalsIgnoreCase("fight")) && hero.getHp() > 0 && enemy.getHp() > 0 && enemy.getHp() - hero.getTotalDamage() > 0) {

            enemy.setHp(enemy.getHp() - hero.getTotalDamage());

            hero.setHp(hero.getHp() - (enemy.getDamage() - hero.getDefense()));

            System.out.println(showAttributes(hero, enemy));

            System.out.print("(F)ight or (R)un :");
            playerChoice = scanner.nextLine();
            System.out.println("\n\n\n\n\n\n");
        }

        String endCombatMessage = "Fight is over";

        if (hero.getHp() > 0 && enemy.getHp() > 0 && !(playerChoice.equalsIgnoreCase("f") || playerChoice.equalsIgnoreCase("fight")))
            enemy.setHp(enemy.getHp() - hero.getTotalDamage());

        if (hero.getHp() <= 0)
            endCombatMessage = "You are Died";
        else if (enemy.getHp() <= 0) {
            hero.setExp(hero.getExp() + enemy.getExp());
            hero.setCoin(hero.getCoin() + enemy.getExp() / 2);
            System.out.printf("hero earned %d coin\n", enemy.getExp() / 2);
            endCombatMessage = "You killed the enemy successfully";
            isWin = true;
        }

        System.out.println(endCombatMessage);
        return isWin;
    }

    public static String showAttributes(Warrior hero, Goblin enemy) {
        return String.format("%s vs %s\nHero------------------\nHealth :\t%.0f\nDamage :\t%d\nDefence :\t%d\nEnemy-----------------\nHealth :\t%d\nDamage :\t%d\n----------------------\n", hero.getName(), enemy.getName(), hero.getHp(), hero.getTotalDamage(), hero.getDefense(), enemy.getHp(), enemy.getDamage());
    }

}
