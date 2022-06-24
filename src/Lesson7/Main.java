package Lesson7;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Malish", 2);
        Cat cat2 = new Cat("Lokki", 3);
        Cat cat3 = new Cat("Chak", 4);
        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(12);


        for (int i = 0; i < cats.length; i++) {
            if (plate.getFood() > 0) {
                cats[i].eat(plate);
                cats[i].print();
                }
            else {
                System.out.println("Нет еды");
                break;
            }
        }
    }
}

