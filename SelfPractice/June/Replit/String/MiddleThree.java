package June.Replit.String;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length= word.length();
        if (length%2!=0 && length>=5){
            System.out.println(word.substring((length-1)/2-1,(length-1)/2+2));
        }else {
            System.out.println("invalid");
        }
    }
}
/*
Given a String variable **word** print the middle three characters if the word is an odd number of characters
and has more than 5 characters. If the word does not meet the requirements print invalid.
```
fifteen ==> fte
```

```
apple ==> ppl
```

```
hey ==> invalid
```

```
java ==> invalid
```

```
whatsup ==> ats
```

```
$ ==> invalid
 */