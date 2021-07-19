package day24_ArraysContinue;

import java.util.Arrays;

public class exeWarmupTask2 {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        int countA=0,countB=0,countC=0,countD=0,countF=0;
        int sum=0;
        for (int i = 0; i < grades.length; i++) {

            sum+=scores[i];
            if (scores[i]>=90){
                grades[i]='A';
                countA++;
            }else if (scores[i]>=80) {
                grades[i] = 'B';
                countB++;
            }else if (scores[i]>=70){
                grades[i]='C';
                countC++;
            }else if (scores[i]>=60) {
                grades[i] = 'D';
                countD++;
            }else if (scores[i]<60) {
                grades[i] = 'F';
                countF++;
            }

        }
        System.out.println(Arrays.toString(grades));
        double average=(double)sum/ grades.length;
        System.out.println(String.format("%.2f", average));
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
//double input = 3.14159265359;
//System.out.format("double : %.2f", input); // 3.14
//        System.out.println("double : " + String.format("%.2f", input)); // 3.14
