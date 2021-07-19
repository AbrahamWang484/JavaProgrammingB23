package day09_IfStatement;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 100;

        if (number % 2 != 0) {
            System.out.println(number + " is odd number");
        } else {
            System.out.println(number + " is even number");
        }
    }
}
