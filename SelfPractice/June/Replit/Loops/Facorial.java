package June.Replit.Loops;

import java.util.Scanner;

public class Facorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //for some number range out of int, so can use long datatype

        long result =1;
        for (long i=n; i>=1;i--){
            result *=i;
        }
        System.out.println(result);
    }
}
/*
In mathematics a **factorial** of a positive integer _n_, denoted by _n_!, is the product of all positive
integers less than or equal to _n_.  Calculate factorial and output result to the console.


Example:

```
input: 5
output: 120

5 * 4 * 3 * 2 * 1
 */
