package ru.skypro;

import java.util.SimpleTimeZone;

public abstract class Hogwarts {
    private String name;
    private int magicalPower;
    private int apparition;

    public Hogwarts (String name, int magicalPower, int apparition) {
        this.name = name;
        this.magicalPower = magicalPower;
        this.apparition = apparition;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    public int abilityHogwarts() {
        return magicalPower + apparition;

    }
    public void compareHogwarts (Hogwarts hogwarts) {
        int ability1 = abilityHogwarts();
        int ability2 = hogwarts.abilityHogwarts();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), hogwarts.getName());
        } else if(ability2 > ability1){
            System.out.printf("Студент %s лучше студента %s%n", hogwarts.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как %s%n", hogwarts.getName(), getName());
        }
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии %d; сила трансгрессии %d", name, magicalPower, apparition);
    }
}

