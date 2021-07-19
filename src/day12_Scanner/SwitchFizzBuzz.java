package day12_Scanner;

public class SwitchFizzBuzz {
    public static void main(String[] args) {
        int number = 5;
//String result =";
        switch(number){
            case 3:
            case 6:
            case 9:
                System.out.println("Fizz"); //result = "Fizz";
                break;

            case 5:
            case 10:
                System.out.println("Buzz");//result = "Buzz";
                break;

            case 1:
                System.out.println(1); //result = 1
                break;
            case 2:
                System.out.println(2);//result = 2
                break;
            case 7:
                System.out.println(7);//result = 7
                break;
            case 8:
                System.out.println(8);//result = 8
                break;
            default:
                System.out.println("Invalid number");//System.out.println(result);
        }
    }
}
/*
2. write a program that can print any number between 1 ~ 10, but for number which is a multiple of 3 print "Fizz" instead of the number and for number which is a multiple of 5, print "Buzz" instead of the number, and for number which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
 */