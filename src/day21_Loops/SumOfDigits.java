package day21_Loops;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "A1B2C3";
        int sum = 0;

        // digits: 1   2   3
        // Asc:   49   50   51
        //       49-48  50-48  51-48

        for (int i = 0; i < str.length() - 1; i++) {
            char each = str.charAt(i);
            if (each >= '0' && each <= '9') {
                sum += each - '0';//due to ASC table, each char has number;
            }  //sum+=each - 48 in order to convert character digit to integer number
        }
        System.out.println("sum = " + sum);
    }
}
/*
a.get the each character on char datatype,
b.in if statement created for char,
c.convert the char to int by subtract by 48,
d. then sum them;

     3. Write a program that can return the sum of digits form  string
     		Ex:
     			input: A1B2C3

     			output:
     					1+2+3
 */