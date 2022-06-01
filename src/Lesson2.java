public class Lesson2 {
    public static void main(String[] args) {

        //numbers2();
        //Line();
        isLimit();
    }

    public static boolean isLimit() {
        int a = 5;
        int b = 19;
        if (10 >= (a + b) && (a + b) <= 20) ;
        {
            return true;
        }
    }

    public static void numbers2() {
        int с = 5;
        if (с >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void numbers3() {
        int d = 5;

        if (d >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void Line() {
        String line = "Hello";

        for (int number = 0; number <= 5; number++) ;
        {
            System.out.println(line);
        }
    }
}
