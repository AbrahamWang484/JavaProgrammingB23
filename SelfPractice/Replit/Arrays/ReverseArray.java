package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int temp; //save the number to temp
        for (int i = 0; i < nums.length/2; i++) { //until .length/2 stop
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}
/*
Given an array **nums** with 7 integers already assigned, write code to reverse it.

**Do not use any additional arrays or Strings.**

Example:

```
nums -> [4, 3, 2, 44, 1, 100, 55]

nums -> [55, 100, 1, 44, 2, 3, 4]
```

PseudoCode:

1. Take values at index 0 and last index and swap them

2. Take values at index 0+1 and last index-1 and swap them

3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:

```
int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;
```


 */