package day49_Exceptions;

import java.io.FileInputStream;

public class ExceptionIntro {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        //  System.out.println( arr[100] );
        //   System.out.println( 100/0 );

        String str = null;

        //  System.out.println( str.toUpperCase() );


        System.out.println("Hello");

        System.out.println("------------------------------------------------");

        try {
            Thread.sleep(3000);  // checked exception
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //    FileInputStream file = new FileInputStream("");

        System.out.println("Hello Robinson");




    }

}