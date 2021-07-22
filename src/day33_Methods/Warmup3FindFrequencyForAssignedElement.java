package day33_Methods;

public class Warmup3FindFrequencyForAssignedElement {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        System.out.println(frequency(array, 2));
    }
    public static int frequency(int[] array, int num){
        int frequency=0;
        for (int each : array) {
            if (each==num)
                frequency++;
        }
        return frequency;
    }
    public static int frequency(double[] array, double num){
        int frequency=0;
        for (double each : array) {
            if (each==num)
                frequency++;
        }
        return frequency;
    }
    public static int frequency(String[] array, String word){
        int frequency=0;
        for (String each : array) {
            if (each.contains(word))
                frequency++;
        }
        return frequency;
    }
    public static int frequency(char[] array, char ch){
        int frequency=0;
        for (char each : array) {
            if (each==ch)
                frequency++;
        }
        return frequency;
    }
}
/*
Task3:
    1. create method that accepts one integer array and one integer number and returns the frequency of the number
                Ex:
                    int[] array ={1,1,1,1,1,2,2};

                    frequency(array, 1) ==> 5


    2. create method that accepts one double array and one double number and returns the frequency of the number


    3. create method that accepts one String array and one String and returns the frequency of the String
            Ex:
                String[] array = {"Apple", "Apple", "Apple", "Orange"}

                frequency(array, "Orange") ==> 1

    4. create method that accepts one char array and a char and returns the frequency of the char
 */