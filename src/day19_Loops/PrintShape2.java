package day19_Loops;

public class PrintShape2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i >= 2 && i <= 9) {
                System.out.println("*    *");
            } else {
                System.out.println("******");
            }
        }
//method 2

        System.out.println("******");
        for (int i = 1; i <= 8; i++) {
            System.out.println("*    *");
        }
        System.out.println("******");
    }
}
/*
print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat
 */