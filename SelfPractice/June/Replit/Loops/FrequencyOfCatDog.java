package June.Replit.Loops;

import java.util.Scanner;

public class FrequencyOfCatDog {
    public static void main(String[] args) {
        String sentence= new Scanner(System.in).next();
        int countOfCats=0;
        int countOfDogs=0;

        String word1="cat";
        String word2="dog";

        for (int i =0; i<=sentence.length()-3;i++){
            String each=sentence.substring(i,i+3);
            if (each.equals(word1) ){
                countOfCats++;
            }
            if (each.equals(word2) ){
                countOfDogs++;
            }
        }
        boolean isequal= countOfCats==countOfDogs;
        System.out.println(isequal);
    }
}
/*
Print true if the string _"cat"_ and _"dog"_ appear the same number of times in the given string _word_.


Example:

```
input: catdog
output: true
```

Example:

```
input: catcat
output: false
```

Example:

```
input: cat-cheetah-dog-cat
output: false
 */
