package Lesson6;


public class Cat extends Animal{
    public static int count =0;

    public Cat(String name, int age, String color){
        super(name, age, color);
    }

    @Override
    void run(int Length) {
        System.out.println("Cat " + getName() + " runs " + Length + "m");;
    }

   /*Override
    public void swim(int distance) {
        System.out.println("Cats don't swim");
    }*/
}



