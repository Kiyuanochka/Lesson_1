package Lesson6;

public class Cat extends Animal {
    public static int count = 0;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        Animal.run();

    }
    static Cat cat1 = new Cat("Mishka", 5, "Black");
    static Cat cat2 = new Cat("Sema", 5, "White");
    static Cat cat3 = new Cat("Lika", 5, "Orange");
    static Cat[] cats = {cat1, cat2, cat3};

}



