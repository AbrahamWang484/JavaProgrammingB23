package day04_Variables;


import java.util.Scanner;

public class Timer {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes=scan.nextInt();
        scan.close();

        for (int i=minutes; i > 0 ;--i) {
            if( i< 0 ) {
                break;
            }
            for (int z=59; z >=0 ; --z) {
                System.out.print("\r"+(i-1)+" minutes and "+z+" seconds left");//\r is Carriage Return, function is as following:
                //1.the cursor will be move to beging, 2.after \r 's content will replace pervious content in same length.
                Thread.sleep(1000);  // pauses the execution of the code for given milli seconds
            }
        }

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

    }
}