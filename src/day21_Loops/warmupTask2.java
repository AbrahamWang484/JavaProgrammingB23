package day21_Loops;

public class warmupTask2 {
    public static void main(String[] args) {
        int n = 30;
        String result1 = "Divisible by 15: ";
        String result2 = "Divisible by 5: ";
        String result3 = "Divisible by 3: ";
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result1 += i + " ";
            }
            if (i % 3 == 0) {
                result3 += i + " ";
            }
            if (i % 5 == 0) {
                result2 += i + " ";
            }
        }
        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result2);
    }

}
/*
2.  Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
                then it should only be displayed in Divisibel By15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
                then it should only be displayed in Divisibel By3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
                then it should only be displayed in Divisibel By5' section

            EX:
            	input: 100
	            Output:
	                 Divisible By 15: 15 30 45 60 75 90
	                 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	                 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */