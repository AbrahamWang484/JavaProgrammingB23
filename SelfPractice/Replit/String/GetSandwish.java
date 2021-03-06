package Replit.String;

import java.util.Scanner;

public class GetSandwish {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.indexOf("bread") != str.lastIndexOf("bread")){
            int indexOfD= str.indexOf("d");
            int indexOfB= str.lastIndexOf("b");
            System.out.println(str.substring(indexOfD+1,indexOfB));
        }else {
            System.out.println("nothing");
        }

    }
}
/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
or return string "nothing" if there are not two pieces of bread.


Example:

```
input: breadjambread

output: jam
```

```
input: xxbreadjambreadyy

output: jam
```

```
input: xxbreadapple

output: nothing
```

```
input: breadbutterbread

output: butter
 */