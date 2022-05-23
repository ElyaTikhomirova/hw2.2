package ru.skypro;

public class Main {




    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 50, 60, 30, 90);
        Gryffindor ron = new Gryffindor("Рон Уизли", 50, 10, 30,35, 10);
        Gryffindor germ = new Gryffindor("Гермиона Грейнджер", 90, 90, 40,20, 20);
        Slytherin draco = new Slytherin("Драко Малфой", 80, 50, 40, 40, 90, 20, 100);
        Slytherin grekhem = new Slytherin("Грэхэм Монтегю", 50, 20, 20, 40, 30, 10, 40);
        Slytherin gregory = new Slytherin("Грегори Гойл ", 30, 20, 20, 10,30, 50, 50);
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 60, 10, 25, 90, 50);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 10, 10,20,30,40);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 10, 20, 50, 30, 25);
        Ravenclaw jou = new Ravenclaw("Чжоу Чанг", 20, 10,15,40, 50, 10);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 10, 15, 20, 30, 10,60);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 40, 30, 20, 70, 55, 50);

        System.out.println(harry);

        ron.compareGryffindor(germ);
        draco.compareHogwarts(harry);
        zaharia.compareHufflepuff(justin);

        zaharia.print();
        jou.print();













    }
}
