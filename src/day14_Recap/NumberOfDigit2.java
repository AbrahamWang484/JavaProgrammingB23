package day14_Recap;

import java.util.Scanner;

public class NumberOfDigit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000:");
        int n =input.nextInt();
        input.close(); //if not cloes, the scanner function will still working, so the memory still has data inside
        String result ="";
        if(n>=1 && n<=100000){
            if(n<=9){
                result="1 digit";
            }else if (n<=99){
                result="2 digit";
            }else if (n<=999){
                result = "3 digit";
            }else if (n<9999){
                result = "4 digit";
            }else if (n<99999){
                result ="5 digit";
            }else {
                result="6 digit";
            }
        }else {
            result= "Invalid Number";


        }
        String result2 = (n>=1 && n<=100000)?
                (n<=9)?"1 digit":(n<=99)?"2 digits":(n<=999)?"3 digits":(n<9999)?"4 digits":(n<99999)?"5 digits":"6 digits"
                :"Invalid";
        System.out.println("result2 = " + result2);
        System.out.println("result = " + result);
    }
}


