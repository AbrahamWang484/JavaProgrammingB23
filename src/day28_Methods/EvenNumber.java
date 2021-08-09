package day28_Methods;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        printEvenNumber(scan.nextInt(),scan.nextInt());
        System.out.println("--------------------");
        eligibleForVote(22,true);
        System.out.println("--------------------");
        calculate(100,2, '%');

    }
    public static void printEvenNumber(int from, int to){
        for (int num = from; num <=to ; num++) {
            if (num%2==0){
                System.out.print(num+" ");
               }
        }
        System.out.println();
    }
    public static void eligibleForVote(int age,boolean isUSCitizen){
        if (age>=21 && isUSCitizen){
            System.out.println("You are eligible for vote");
        }else {
            System.out.println("You are not eligible for vote");
        }
    }
    public static void calculate(int num1,int num2, char operator){
        switch (operator){
            case'+':
                System.out.println(num1+num2);
                break;

            case'-':
                System.out.println(num1-num2);
                break;

            case'*':
                System.out.println(num1*num2);
                break;

            case'/':
                System.out.println(num1/num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
