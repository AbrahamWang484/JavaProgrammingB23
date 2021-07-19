package June.Replit.Methods;

import java.util.Scanner;

public class PrintUniqueNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int num : nums) {
            int count = 0;
            for (int each : nums) {
                if (num==each){
                    count++;
                }
            }
            if (count ==1){
                    System.out.println(num);
        }
        }
    }
}
/*
Write a void method **printUniqueNumbers** that will print unique numbers from an array of ints.`

Example:

```
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]

output:
2
9
34
```
 */