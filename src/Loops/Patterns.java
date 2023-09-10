package Loops;

public class Patterns {
    public static void main(String[] args) {
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        System.out.println();

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
        for (int i = 0; i <= 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//                  *
//                * * *
//              * * * * *
//            * * * * * * *
//          * * * * * * * * *
        for (int i = 0; i <= 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();

//        *
//        * *
//        *   *
//        *     *
//        *       *
//        * * * * * *
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == (6) || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
