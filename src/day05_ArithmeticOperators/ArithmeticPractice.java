package day05_ArithmeticOperators;

public class ArithmeticPractice {

    public static void main(String[] args) {
        int number = 15;
        double a= number%3;
        double b= number%5;
        boolean isEvenlyDivisibleBy3 =   number%3 == 0; // ==: equal operator
        //                                     1  == 0 ===> false

        boolean isEvenlyDivisibleBy5 =  number%5 == 0; // if the remainder of number/5 is zero, then it's evenly divisible by 5

        System.out.println(number+" is evenly divisible by 3: "+isEvenlyDivisibleBy3);
        System.out.println(number+" is evenly divisible by 5: "+isEvenlyDivisibleBy5);
        System.out.println("a = " + a); //reminder is 0 means evenly divisible by that number
        System.out.println("b = " + b);

    }


}
