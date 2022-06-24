package Lesson7;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Malish", 2, false);
        Cat cat2 = new Cat("Lokki", 3, false);
        Cat cat3 = new Cat("Chak", 4, false);
        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(25);


        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            if (plate.getFood() > 0) {
                cats[i].print();
                System.out.println("one more " + plate.getFood());
            } else {
                System.out.println("Isn't food");
                break;
            }
        }
    }
}


