package main.dev.efficienthouse.app.entity.enemy;

public class Zombie {
    public String name;
    public int hp;
    public int damage;
    public int defence;
    public int level;
    public int exp;

    public Zombie(String newName, int newLevel, int newExp, int newHp, int newDamage, int newDefence) {
        name = newName;
        level = newLevel;
        exp = newExp;
        hp = newHp;
        damage = newDamage;
        defence = newDefence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
