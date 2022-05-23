package ru.skypro;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int fairness;

    public Hufflepuff(String name, int magicPower, int apparition, int hardworking, int loyalty, int fairness) {
        super(name, magicPower, apparition);
        this.hardworking = hardworking;
        this.loyalty = fairness;
        this.fairness = fairness;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getFairness() {
        return fairness;
    }

    public void setFairness(int fairness) {
        this.fairness = fairness;
    }


    public int ability() {
        return hardworking + loyalty + fairness;
    }
    public void compareHufflepuff (Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("%s лучший Пуффендорец, чем %s%n", getName(), hufflepuff.getName());
        } else if(ability2 > ability1){
            System.out.printf("%s лучший Пуффендорец, чем %s%n", hufflepuff.getName(), getName());
        } else {
            System.out.printf("Пуффендорец %s такой же, как %s%n", hufflepuff.getName(), getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), hardworking, loyalty, fairness);
    }
}

