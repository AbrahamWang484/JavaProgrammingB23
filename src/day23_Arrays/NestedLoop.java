package day23_Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) { //outer loop decide the repeat times of lines

            for (int i = 1; i < 6; i++) { //inner loop decide the print content
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
use nested loop to print following code:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */