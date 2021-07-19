package day22_Recap;


import java.util.Scanner;

public class DoWhileLoopPractise {
    public static void main(String[] args) {
        int sumOfEven =0; //intial
        int sumOfOdd= 0;
        int i =0;
        do{
            if (i%2==0){
                sumOfEven+=i;
            }else {
                sumOfOdd+=i;
            }
            System.out.println(i);//statement
            i++;//iterator
        }while (i<=10);//conditiond // i= 0 1 2 3 4 5 6 7 8 9 10
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);

        System.out.println("-------------------------");

        Scanner scan= new Scanner(System.in);

        String username="wang";
        String password="123";
        String u="";
        String p="";

        do{
            System.out.println("Enter yor username:");
            u=scan.next();

            System.out.println("Enter your password");
            p=scan.next();

        }while (!(u.equals(username)&&p.equals(password)));// while the credentials are incorrect
        System.out.println("Logged in");
    }
}
/*
Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
 */