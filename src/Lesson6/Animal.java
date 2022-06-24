package Lesson6;

public class Animal {




    private String name;
    private int age;
    private String color;

    public static int count = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    void run(int Length) {
        System.out.println(name + " runs " + Length + "m");
    }

    public void print() {
            System.out.println("[ " + name + ", " + age + ", " + color + "]");


        }

}
