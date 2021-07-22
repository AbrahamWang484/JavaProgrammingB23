package day33_Methods;

public class Warmup2isContained {
    public static void main(String[] args) {
        int[] array= {1,2,3,4};
        int num=4;
        System.out.println(isContained(array,num));

        String[] array2= {"java","C#","Python"};
        String str="java";
        System.out.println(isContained(array2,str));

        double[] array1= {1.1,2.1,3.1,4.1};
        double num1=4.1;
        System.out.println(isContained(array1,num1));

        char[] array3= {'a','b','c'};
        char ch='d';
        System.out.println(isContained(array3,ch));

    }
    public static boolean isContained(int[] array, int num) {

        for (int each : array) {
            if (each == num) {
                return true;
            }
        }return false;
    }
    public static boolean isContained(double[] array, double num) {

        for (double each : array) {
            if (each == num) {
                return true;
            }
        }return false;
    }

    public static boolean isContained(String[] array, String str) {

        for (String each : array) {
            if (each.equals(str)) {
                return true;
            }
        }return false;
    }

    public static boolean isContained(char[] array, char ch) {

        for (char each : array) {
            if (each == ch) {
                return true;
            }
        }return false;
    }
    
    
}
/*
Task2:
    1. create a method that accepts two parameters: one integer array and one integer number. The method returns true if the number is contained in the integer array, otherwise returns false

    2. create a method that accepts two parameters: one double array and one double number. The method returns true if the decimal number is contained in the double array, otherwise returns false

    3. create a method hat accepts two parameters: one String array and one String. The method returns true if the String is contained in the String array, otherwise returns false

    4. create a method hat accepts two parameters: one char array and one char. The method returns true if the char is contained in the char array, otherwise returns false
 */
