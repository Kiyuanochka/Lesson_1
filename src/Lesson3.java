
import java.util.Random;
import java.util.Random.*;

public class Lesson3 {


    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        //sixth();
    }

    public static void first() {
        int[] a = new int[10];

        a[0] = 1;
        a[1] = 0;
        a[2] = 1;
        a[3] = 0;
        a[4] = 0;
        a[5] = 1;
        a[6] = 1;
        a[7] = 1;
        a[8] = 0;
        a[9] = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }

    public static void second() {
        int[] b = new int[100];
        for (int i = 0; i < 100; i++) {
            b[i] = i + 1;
            System.out.print(b[i] + " ");
        }
    }

    public static void third() {
        int[] c = new int[12];
        c[0] = 1;
        c[1] = 5;
        c[2] = 3;
        c[3] = 2;
        c[4] = 11;
        c[5] = 4;
        c[6] = 5;
        c[7] = 2;
        c[8] = 4;
        c[9] = 8;
        c[10] = 9;
        c[11] = 1;

        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] = c[i] * 2;
                System.out.print(c[i] + " ");
            }
        }
        }
        public static void fourth () {
            int[][] a = new int[5][5];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i == j) {
                        a[i][j] = 1;

                    }
                    System.out.print(a[i][j] + " ");
                    //a[0][a.length-1] = 1;
                    //a[a.length-1][0] = 1;
                }
                System.out.println();
            }
        }

        /*
        // Не могу сообразить, как сделать противоположную диагональ....
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= 0; j--) {
                a[i][j] = 1;
                System.out.print(a[i][j] + " ");
                break;
            }

        }
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            j--;
            a[i][j] = 1;
            System.out.print(a[i][j] + " ");
        }*/
        public static void fifth(){
            int len = 10;
            int initialValue = 5;

            int[] a = new int[len];
            for (int i = 0; i < len; i++) {
                a[i] = initialValue;
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        /*public static void sixth(){
            Random random = new Random();
            random.nextInt();
            int[] a = new int[3];
            for(int i = 0; i < a.length; i++){
                a[i] = random.nextInt(3);
                //System.out.print( a[i] + " ");
                }
            for(int i =0; i < a.length; i++){

                if (a[i] > a[i++]) {
               System.out.print(a[i] + " "); }
                else { System.out.print(a[i] + " ");

                }

            }*/

    }







