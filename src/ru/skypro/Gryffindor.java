package ru.skypro;

public class Gryffindor extends Hogwarts {
    private int courage;
    private int chivalry;
    private int bravery;


    public Gryffindor (String name, int magicPower, int apparition, int courage, int chivalry, int bravery) {
        super(name, magicPower, apparition);
        this.courage = courage;
        this.chivalry = chivalry;
        this.bravery = bravery;
    }
    public int getBravery() {
        return bravery;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getCourage() {

        return courage;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    public int getChivalry() {

        return chivalry;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void compareGryffindor (Gryffindor gryffindor) {
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("%s лучший грифиндорец, чем %s%n", getName(), gryffindor.getName());
        } else if(ability2 > ability1){
            System.out.printf("%s лучший грифиндорец, чем %s%n", gryffindor.getName(), getName());
        }else {
            System.out.printf("Грифиндорец %s такой же, как %s%n", gryffindor.getName(), getName());
        }
    }


    public int ability() {
        return courage + chivalry + bravery;
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), courage, chivalry, bravery);
    }


}
