package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float sum=0,total;

        //get 7 scores
        for (int i=0;i<7;i++)
        {
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i] = input.nextFloat();
        }

        //get the sum excluded the min && max scores
        Arrays.sort(score);
        for (int i = 1; i < 6 ; i++) {
            sum+=score[i];
        }

        //Accept the difficulty number
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();


        //Display the final Score
        total= (float) (sum*difficulty*0.6);
        System.out.println(total);
    }
}
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.

The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.


Flow:
- Accept the 7 scores from the judges
- Accept the difficulty number
- Display the final score

```
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
```
 */
