package utilities;

public class NumbersUtility {

    //isOdd
    public static boolean isOdd(int num){
        boolean isOdd=(num%2!=0)?true:false;
        return isOdd;
    }


    //isEven
    public static boolean isEven(int num){
        boolean isEven=(num%2==0)?true:false;
        return isEven;
    }
    //addition
    public static int addition(int a, int b){
        int c = a + b;
        return c;
    }

    //subtraction
    public static int subtraction(int a, int b){
        int c = a - b;
        return c;
    }

    //max
    public static int max(int a, int b){

        int max= (a>b)?a:b;
        return max;
    }
    // min
    public static int min(int a, int b){

        int min= (a>b)?b:a;
        return min;
    }
    //cube...
    public static int cube(int a){

        int cube=a*a*a;
        return cube;
    }

}