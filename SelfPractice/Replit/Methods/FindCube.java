package Replit.Methods;

import java.util.Scanner;

public class FindCube {

    //your code here
    public static void cube(){
        int num =new Scanner(System.in).nextInt();
        System.out.println(num*num*num);

    }



    //end cube

    public static void main(String[] args) {

        cube();

    }
}

/*
Create a method called **cube**. It is a void method with no arguments. Write all required code inside this method in order to read a number from the console and then prints the cubed value of that number:

Example:

```
input: 5

output: 125
```

> hint: cube of a number n = n^3 ->
```
n * n * n
```
 */