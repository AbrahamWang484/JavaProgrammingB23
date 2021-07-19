package day23_Arrays;

public class WarmupTask1A {
    public static void main(String[] args) {
        String str="aabcccd";
        char input='c';
        int frequency=0;

        for (int i = 0; i < str.length()-1; i++) {
            char each=str.charAt(i);
            if (each==input)
                frequency++;
        }
        System.out.println(frequency);
    }
}
/*
1. Write a program that can find the frequency of any given character from a string
			Ex:
				str = "aabcccd";

				input: 'c'
				output: 3

				input: 'e'
				output: 0
 */