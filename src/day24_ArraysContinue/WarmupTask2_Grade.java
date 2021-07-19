package day24_ArraysContinue;

import java.util.Arrays;

public class WarmupTask2_Grade {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah", "Wang"};
        int[] scores = {90, 75, 30, 46};
        char[] grades = new char[names.length];
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;


        int sum = 0;
        for (int i = 0; i < grades.length; i++) {

            sum += scores[i];
            int eachScore = scores[i];//gets each score from the array scores
            if (eachScore >= 90) {
                grades[i] = 'A';
                countA++;
            } else if (eachScore >= 80) {
                grades[i] = 'B';
                countB++;
            } else if (eachScore >= 70) {
                grades[i] = 'C';
                countC++;
            } else if (eachScore >= 60) {
                grades[i] = 'D';
                countD++;
            } else {
                grades[i] = 'F';
                countF++;
            }


            //Ternary method :
            //grades[i] = (eachScore >= 90)?'A':(eachScore >= 80)?'B':(eachScore >= 70)?'C':(eachScore >= 60)?'D':'F';
            System.out.println(names[i] + ":" + scores[i] + "," + grades[i]);

        }
        //System.out.println(Arrays.toString(grades));

        double avg =  (double)sum / grades.length;
        System.out.println("avg = " + avg);

        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);

    }
}
/*

2. given the following arrays:
         String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the grades of the students in the array named grades
 */