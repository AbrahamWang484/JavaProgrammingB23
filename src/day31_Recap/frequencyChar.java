package day31_Recap;

public class frequencyChar {
    public static int frequency(String str, char ch) {
        int frequency = 0;
        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            if (ch == aChar)
                frequency++;
        }
        return frequency;
    }
}

/*
1. Write a return method named frequency that accepts two parameters: String and Char. then returns the frequency of the char from the string
            Ex:
                frequency("AAABB", 'A');  ==> 3
 */