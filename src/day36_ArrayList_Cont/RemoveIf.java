package day36_ArrayList_Cont;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Mohammad", "Merve", "Said", "Feruza"));
        names.removeIf(name -> (name.contains("a")));

        System.out.println(names);

        System.out.println("--------------------------");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Python", "Cybertek", "Pop", "Kayak", "Sabas"));
        words.removeIf(p -> StringUtility.isPalindrome(p));//if the String is palindrome, then remove it from the string

        System.out.println(words);
    }
}
