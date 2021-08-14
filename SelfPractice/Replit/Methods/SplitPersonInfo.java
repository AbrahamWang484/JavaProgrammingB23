package Replit.Methods;

import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String[] infoArray=info.split(",");
        System.out.println("person name:"+infoArray[0]);
        System.out.println("last name:"+infoArray[1]);
        System.out.println("age"+infoArray[2]);
    }
}
/*
The method **person** has a string arguement with this format:
"name,last name,age". Print out the person's information

Example:

```
person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
```

hint: use the `split` method to split the string to a string array where there is a "," char
 */