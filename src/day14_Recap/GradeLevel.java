package day14_Recap;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        byte grade = scan.nextByte();
        String gradeLevel ="";

        if (grade>=1 && grade<=18){

            gradeLevel =(grade<=5)?"Elementary school":(grade<=8)?"Middle school":(grade <=12)?"High school":(grade <=16)?"College":"Grad School";
            /*if(grade>=1 && grade<=5){
                System.out.println("Elementary school");
            }else if (grade>=6 && grade<=8){
                System.out.println("Middle school");
            }else if (grade>=9 && grade <=12){
                System.out.println("High school");
            }else if (grade>=13 && grade <=16){
                System.out.println("College");
            }else {
                System.out.println("Grad School");
            }
             */
        }else{
            gradeLevel="Invalid";
            System.out.println("gradeLevel = " + gradeLevel);
            scan.close();
        }
    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given
 */