package Lesson6;

public class Dog extends Animal implements Swimming{
    public static int count = 0;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        Animal.run();
    }

    @Override
    public void swim() {

    }
}

