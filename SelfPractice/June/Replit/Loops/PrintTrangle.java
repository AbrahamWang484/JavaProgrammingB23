package June.Replit.Loops;

import java.util.Scanner;

public class PrintTrangle {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //input your code:
        for (i = 1; i <= n; i++) { // rows number
            for (j = 1; j <= i; j++) {// every row's stars
                System.out.print("*");
            }
            System.out.println();
        }//i =1; j =1; j=1
        //i=2; j<=2,j=1 & 2 *  **
        //i=3; j<=3, j=1 & 2 & 3 >> *  **  ***
        //i=4; j<=4, j
    }


}

/*
Write a program that will create a triangle of asterisks based on size **n**.

Example:

```
input: 5

output:
*
**
***
****
*****
```

Example:

```
input: 3

output:
*
**
***
```



 */