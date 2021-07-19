package day23_Arrays;

public class PrintStars_NestedLoop {
    public static void main(String[] args) {
        for (int j = 0; j < 6; j++) { //outer loop will repeat how many times of lines

            for (int i = 0; i < 20; i++) {//inner loop
                System.out.print("*");// print 20 times of * in one line: what will be print
            }
            System.out.println(); //appends new line after printing each 20 *

        }
    }

}
/*
Print the following figure use nested loop:
********************
********************
********************
********************
********************
********************

 */