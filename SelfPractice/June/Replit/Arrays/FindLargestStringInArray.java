package June.Replit.Arrays;

import java.util.Scanner;

public class FindLargestStringInArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        String largestWord=words[0];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length()>largestWord.length())
//                largestWord=words[i];
//        }
        for (String word : words) {
            if (word.length()>largestWord.length())
                largestWord=word;
        }
        System.out.println(largestWord);

    }
}
/*
Given the array **words** find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:
```
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */