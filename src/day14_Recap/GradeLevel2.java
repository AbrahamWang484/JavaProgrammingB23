package day14_Recap;

import java.util.Scanner;

public class GradeLevel2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        String gradeLevel ="";

        switch(scan.nextByte()){//if for the value only use one time , so no need assign the variable
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                gradeLevel="Elementary school";
                break;

            case 6:
            case 7:
            case 8:
                gradeLevel="Middle school";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                gradeLevel="High school";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                gradeLevel="College";
                break;

            case 17:
            case 18:
                gradeLevel ="Grad School";
                break;
            default:
                gradeLevel="Invalid";





        //if (grade>=1 && grade<=18){

            //gradeLevel =(grade<=5)?"Elementary school":(grade<=8)?"Middle school":(grade <=12)?"High school":(grade <=16)?"College":"Grad School";
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
        //}else{
           // gradeLevel="Invalid";
           // System.out.println("gradeLevel = " + gradeLevel);
           // scan.close();
        }
        System.out.println("gradeLevel = " + gradeLevel);
    }
}
