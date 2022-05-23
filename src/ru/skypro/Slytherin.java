package ru.skypro;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int domination;

    public Slytherin(String name, int magicPower, int apparition, int cunning, int determination, int ambition, int resourcefulness, int domination) {
        super(name, magicPower, apparition);
        this.cunning = cunning;
        this.domination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.domination = domination;
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDomination() {
        return domination;
    }

    public void setDomination(int domination) {
        this.domination = domination;
    }

    public void compareSlytherin (Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", getName(), slytherin.getName());
        } else if (ability2 > ability1) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", slytherin.getName(), getName());
        } else {
            System.out.printf("Слизеринец %s такой же, как %s%n", slytherin.getName(), getName());
        }
    }

    public int ability() {
        return cunning + determination + ambition + resourcefulness + domination;
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительнсоть: %d; амбициозность: %d, находчивость: %d, жажда власти:%d", super.toString(), cunning, determination, ambition, resourcefulness, domination);
    }
}
