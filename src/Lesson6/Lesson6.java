package Lesson6;
import java.util.Random;
public class Lesson6 {

    public static void main(String[] args) {
        Random random = new Random();

        Cat cat1 = new Cat("Mishka", 5, "Black");
        Cat cat2 = new Cat("Sema", 5, "White");
        Cat cat3 = new Cat("Lika", 5, "Orange");
        Cat[] cats = {cat1, cat2, cat3};
        Dog dog1 = new Dog("Tisha", 5, "Black");
        Dog dog2 = new Dog("Mika", 5, "Yellow");
        Dog dog3 = new Dog("Licci", 5, "Orange");
        Dog[] dogs = {dog1, dog2, dog3};

    for (int i = 0; i < cats.length; i++){
        cats[i].run(random.nextInt(201));}
    for (int i = 0; i < dogs.length; i++){
        dogs[i].run(random.nextInt(501));

        }

    }
}
