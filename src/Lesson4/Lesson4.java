package Lesson4;

import java.util.Scanner;
import java.util.Random;

public class Lesson4 {


        public static void main(String[] args) {
            String[][] field = initField(3);
            printField(field);

            while (true) {
                humanTurn(field);
                printField(field);
                if (isDraw(field)) {
                    break;
                }
                if (isWinner(field, "X")) {
                    System.out.println("You are win");
                    break;
                }

                aiTurn(field);
                printField(field);
                if (isDraw(field)) {
                    break;
                }
                if (isWinner(field, "0")) {
                    System.out.println("You are lose");
                    break;
                }

            }
            System.out.println("Game over");
        }

        public static String[][] initField(int size) {
            String[][] field = new String[size][size];
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    field[i][j] = "*";
                }
            }
            return field;
        }

        public static void printField(String[][] field) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }

        public static void humanTurn(String[][] field) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Your turn");
                int x = scanner.nextInt()-1;
                int y = scanner.nextInt()-1;
                int size = field.length;

                if (x < size && y < size && x >= 0 && y >= 0) {

                    if (field[x][y].equals("*")) {
                        field[x][y] = "X";
                        break;
                    } else {
                        System.out.println("Wrong step");
                    }

                } else {
                    System.out.println("Try again");
                }

            }
        }

        public static void aiTurn(String[][] field) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                Random random = new Random();
                int x = random.nextInt(field.length);
                int y = random.nextInt(field.length);
                if (field[x][y].equals("*")) {
                    field[x][y] = "0";
                    break;
                }
            }
            System.out.println("Computer is going...");
        }

        public static boolean isDraw(String[][] field) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j].equals("*")) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static boolean isWinner(String[][] field, String turn) {

            if (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ||
                    field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) ||
                    field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)
            ) {
                return true;
            }

            else if (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) ||
                    field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) ||
                    field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)) {
                return true;
            }

            else if (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) ||
                    field[2][0].equals(turn) && field[1][1].equals(turn) && field[0][2].equals(turn)) {
                return true;
            }

            return false;
        }

    }


