package day19_Loops;

public class PyramidShape1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop decide the how many lines
            for (int j = 1; j <= i; j++) { // inner loop decide the how many stars print in one line
                System.out.print("* ");
            }
            System.out.println();//new line
        }
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        System.out.println("----------------");

        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }
        /*
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        // outer loop to handle number of rows n in this case
        int n = 5;
        for (int i = 0; i < n; i++) {
            // inner loop to handle number spaces values changing acc. to requirement
            for (int j = n - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }
            //  inner loop to handle number of columns values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }

    }
}
