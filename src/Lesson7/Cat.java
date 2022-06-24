package Lesson7;

public class Cat {
    private String name;
    int appetite;
    int count;
    boolean full(){
        return false;
    };

       public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){

        p.decreaseFood(appetite);
    }

    public void print(){
        System.out.println("[ " + name + " has eaten and full]");
    }
}
