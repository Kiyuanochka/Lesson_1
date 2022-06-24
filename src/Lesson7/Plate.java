package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    void decreaseFood(int n){
        food -= n;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
