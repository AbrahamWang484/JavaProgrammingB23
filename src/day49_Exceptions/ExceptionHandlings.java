package day49_Exceptions;

import day45_Inheritance.employeeTask.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class ExceptionHandlings {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {                   //unchecked Exception
            System.out.println(str.charAt(200)); // StringIndexOutOfBounds
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch Block: Runtime exception occured");
        }


        str += " Shcool";

        System.out.println(str);

        System.out.println("------------------------------------------");

        try {
            System.out.println(9 / 0); // Arithmetic exception  // unchecked exception
        } catch (IllegalArgumentException e) {
            //  System.out.println( e.getMessage() );
            e.printStackTrace();  // to print the detail tracking info
        } catch (IndexOutOfBoundsException e) {
            //  System.out.println( e.getMessage() );
            e.printStackTrace();
        } catch (ArithmeticException e) {
            //   System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            //  System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Test completed");

        System.out.println("---------------------------------------------------");

        try { // plan A
            System.out.println("".substring(10, 20)); //"Cybertek"
        } catch (ArithmeticException e) { // Plan B
            e.printStackTrace();
        } catch (NumberFormatException e) { // Plan C
            e.printStackTrace();
        } catch (IllegalArgumentException e) { // Plan D
            e.printStackTrace();
        } catch (InputMismatchException e) { // Plan E
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("test completed222");

        System.out.println("-----------------------------------------");

        //checked exception
        try {
            FileInputStream file = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("test done123");

        //Thread.sleep(1000); checked exception
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleep_Thread");

    }

}
