package day23_Arrays;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        String[] month ={"Jan","Feb","Mar","Apr","May","June","July","August","Sep","Oct","Nov","Dec"};
        //for (int i = 0; i < month.length; i++) {
        //    System.out.print(month[i]+" ");

        System.out.println("Enter one number:");
        int n = new Scanner(System.in).nextInt();

        if (n>=1 && n<=12){
            System.out.println(month[n-1]);
        } else {
            System.out.println("Invalid Number");
        }

    }
}
/*
Print the month of year.
 */
