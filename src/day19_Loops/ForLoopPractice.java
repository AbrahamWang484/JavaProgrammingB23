package day19_Loops;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");// add the space bw the numbers
        }
        System.out.println();// add a new line
        System.out.println("hello");
        System.out.println("--------------");
// odd number method 1
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------");
// odd number method 2
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------");
// even number
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------");

        String odd="";
        String even="";

        for (int i = 1; i <= 101; i++) {
            if (i % 2 != 0) {
                odd +=i+" "; //concatenation method
            }else {
                even +=i+" ";
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
        System.out.println();
        System.out.println("--------------");


    }


}
