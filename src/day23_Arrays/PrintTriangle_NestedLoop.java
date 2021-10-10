package day23_Arrays;

public class PrintTriangle_NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) { //i: number of lines
            for (int j = 1; j <= i; j++) { //j: number of * in each line. here each line's star number related to line number,
                //so that should  make connection with i & j;
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("----------------------------");

        for (int i = 1; i <= 7; i++) { //i: number of lines
            for (int j = 7; j >= i; j--) { //j: number of * in each line. here each line's star number related to line number,
                //so that should  make connection with i & j;
                System.out.print("*");
                /*
                 *******
                 ******
                 *****
                 ****
                 ***
                 **
                 *
                 */
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------");

        for (int i = 0; i <= 7; i++) { //i: number of lines
            for (int j = 2 * (7 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //j: number of * in each line. here each line's star number related to line number,
                //so that should  make connection with i & j;
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         */
        System.out.println("----------------------------");

    }
}
//https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/
/*
Print the following figure:

 *
 **
 ***
 ****
 *****
 ******
 *******
 *//*
*
**
***
****
*****
******
*******

----------------------------
*******
******
*****
****
***
**
*

----------------------------
               *
             * *
           * * *
         * * * *
       * * * * *
     * * * * * *
   * * * * * * *
 * * * * * * * *

----------------------------
 */
