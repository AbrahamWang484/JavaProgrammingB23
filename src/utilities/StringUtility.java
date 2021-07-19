package utilities;

import java.util.Arrays;

public class StringUtility {


    //reverses any given string, and returns it
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) { // i : 2, 1, 0
            reverse += str.charAt(i); //
        }
        return reverse;
    }

    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) { // "Java"
        String reversedStr = reverse(str);  //"avaJ"
        return str.equalsIgnoreCase(reversedStr);
    }

    //remove duplicates from string, returns string
    public static String removeDup(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) < 0) { //indexOf() < 0 means the element doesnot exit in the String result
                result += ch;
            }
        }

        return result;
    }

    // checks if two strings are anagram, returns boolean
    public static boolean isAnagram(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        boolean isAnagram = Arrays.equals(charsA, charsB);
        return isAnagram;
    }

    //return the frequency of ch from the string str
    public static int frequency(String str, char ch) {
        int frequency = 0;
        char[] chars = str.toCharArray();

        for (char element : chars) {
            if (ch == element)
                frequency++;
        }
        return frequency;
    }

    //returns the unique characters from the string
    public static String uniqueChars(String str) {
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            int frequency = frequency(str, each);
            if (frequency == 1) {
                unique += each;
            }
        }

        return unique;

    }

    //returns the frequency each characters, return String
    public static String frequencyOfChars(String str) {
        String result = "";
        for (char each : removeDup(str).toCharArray()) {
            int frequency = frequency(str, each);
            result += "" + each + frequency;
        }
        return result;
    }


    //return the frequency of word from the string
    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }


}
