package main.dev.efficienthouse.app.entity.enemy;

public class Rat {

    public String name;
    public int hp;
    public int damage;
    public int defence;
    public int level;
    public int exp;

    public Rat(String newName) {
        setName(newName);
        setLevel(1);
        setExp(0);
        setHp(100);
        setDamage(5);
        setDefence(5);
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
