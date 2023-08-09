package main.dev.efficienthouse.app.entity.hero;

public class Samurai {
    public String name;
    public double hp;
    public int damage;
    public int defense;
    public int exp;
    public int level;

    public Samurai(String newName, double newHp, int newStrength, int newDefense, int newExp, int newLevel) {
        name = newName;
        hp = newHp;
        damage = newStrength;
        defense = newDefense;
        exp = newExp;
        level = newLevel;
    }


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double newHp) {
        hp = newHp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int newStrength) {
        damage = newStrength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int newDefense) {
        defense = newDefense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int newExp) {
        exp = newExp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }
}
