package Practice_06_09_2021;

import com.sun.media.sound.AiffFileReader;

import java.util.Scanner;

public class CodilityTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=scan.nextInt() ;
    String result="";
    if (number%2==0){
        result  +="Codility";
    }

    if (number%3==0){
        result +="Test";
    }

    if (number%5==0){
        result +="Coders";
    }

        System.out.println("result = " + result);
    }
}
/*
Write a function:
that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe
replaced by the word
	Codility -- 2
	Test     -- 3
	Coders   -- 5
- If a number is divisible by more than one of the numbers:2,3 or 5, it should be
replaced by a concatenation of the respective words Codility, Test and Coders in this
given order.

 */