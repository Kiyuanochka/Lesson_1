package Lesson7;

public class Cat {
    private String name;
    int appetite;
    int count;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){

        p.decreaseFood(appetite);
    }

    public void print(){
        System.out.println("[ " + name + " eats]");
    }
}
