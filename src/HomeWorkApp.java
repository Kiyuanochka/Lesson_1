public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 5;
        int b = 8;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        }
         else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Red");
        }

        if (value > 100) {
            System.out.println("Green");
        }
        if (0 < value && value <= 100) {
            System.out.println("Yellow");
        }
    }
    public static void compareNumbers(){
        int a = 5;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }


    }
}