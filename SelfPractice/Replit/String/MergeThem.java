package Replit.String;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word1=scan.next();
        String word2=scan.next();

        int length1 = word1.length();
        int length2 =word2.length();

        if (length1==length2){
            String merge =""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
            System.out.println(merge);

        } else if (length1 != length2){
            System.out.println("cannot merge");
        }
    }
}
/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

```
Input:
aok
lol

Output:
alookl
```

```
Input:
ear
pie

Output:
epaire
```

```
Input:
java
wow

Output:
cannot merge
```

hint:

_by inserting +""+ (empty string) between chars, you can concatenate char values._
 */