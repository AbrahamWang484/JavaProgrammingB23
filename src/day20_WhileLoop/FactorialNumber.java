package day20_WhileLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        int result = 1; // multipliy use 1 not 0, if ==1, the result will be 0

        for (int i = input; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */