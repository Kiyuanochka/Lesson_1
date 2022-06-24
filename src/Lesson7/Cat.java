package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    int count;





    public void eat(Plate p){
        p.decreaseFood(appetite);
    }

    public void print(){
        System.out.println("[ " + name + "]");
    }
}
