package day05_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println( 25 / 2 ); //12

        System.out.println( 25.0 / 2 );//12.5
        System.out.println(25 / 2.0 );//12.5
        System.out.println( 25d / 3);//8.3333333333334

      //  System.out.println( 10 / 0 );

        int a =  100/3 ; //33
        System.out.println("a = " + a);

        double b = 100/3;  // 33.3333..   or 33  or 33.0
        //      b =   33 ==> 33.0

        System.out.println("b = " + b);
        
        double c = 100.0/3;

        System.out.println("c = " + c); //c = 33.333333333333336

        System.out.println("-------------------------------------------------");
        int n1 = 100;
        int n2 = 40;
        // 100/40 ==>2
        System.out.println(n1%n2);  // 20


        
        


    }
}
