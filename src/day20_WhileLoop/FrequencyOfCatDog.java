package day20_WhileLoop;

public class FrequencyOfCatDog {
    public static void main(String[] args) {
        String sentence = "Cat Dog Cat Dog";
        String word1 = "Dog";
        String word2 = "Cat";

        int numberOfCats = 0;
        int numberOfDogs = 0;

// 1. create for loop
// 2. get substring for the specific word
// 3.use if statement to count the word 4 boolean

        for (int i = 0; i <= sentence.length() - 3; i++) {
            String each = sentence.substring(i, i + 3);
            if (each.equals(word1)) {
                numberOfCats++;  // increase the count by 1
            }
            if (each.equals(word2)) {
                numberOfDogs++;  // increase the count by 1
            }
        }
        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberOfDogs = " + numberOfDogs);

        boolean isEqual = numberOfCats == numberOfDogs;
        System.out.println(isEqual);
    }
}
/*
. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

    	Ex:
    		sentence = "cat dog dog cat"

    		output:
    			true
 */