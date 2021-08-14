package Replit.Arrays;

import java.util.Scanner;

public class countEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int evencount=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0)
                evencount++;
        }
        System.out.println(evencount);

    }
}
/*
Given an array **nums**, count and print the number of even numbers in the array

Examples:

```
nums → [2, 1, 2, 3, 4]) → 3

nums → [2, 2, 0, 3, 5]) → 3

nums → [1, 3, 5, 7, 9]) → 0
```
 */
