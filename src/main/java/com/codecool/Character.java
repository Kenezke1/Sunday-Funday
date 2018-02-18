package com.codecool;

public class Character {

    private String name;
    private Hero hero;
    private int health;
    private int attack;
    private int defense;
    private int superAttack;

    public Character(String name, Hero hero, int health, int attack, int defense, int superAttack){
        this.name = name;
        this.hero = hero;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.superAttack = superAttack;
    }

    public String getName(){
        return name;
    }

    public Hero getHero(){
        return hero;
    }

    public int getHealth(){
        return health;
    }

    public int getAttack(){
        return attack;
    }

    public int getDefense(){
        return defense;
    }

    public int getSuperAttack(){
        return superAttack;
    }

    public void setAttack(int num){
        this.attack += attack;
    }

    public void setDefense(int num){
        this.defense += defense;
    }

    public boolean isAlive() {
        return health > 0;
    }

    protected void takeDamage(int damageTaken) {
        System.out.println("He?" + this + ", damageTaken=" + damageTaken);
        health = health - damageTaken;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String toString() {
        return "Name=" + name
                + " hero type=" + hero
                + " health=" + health
                + " attack=" + attack
                + " defense=" + defense
                + " " + (isAlive() ? "ALIVE" : "DEAD");
    }

}
