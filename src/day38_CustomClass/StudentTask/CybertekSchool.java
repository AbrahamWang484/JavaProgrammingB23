package day38_CustomClass.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ibrahim","male","Mar02,1990","001","A");
        Student student2 = new Student();
        student2.setInfo("Ayisha","female","Jun29,1994","002","B");
        Student student3 = new Student();
        student3.setInfo("Wang","male","Dec10,1988","003","B");
        Student student4 = new Student();
        student4.setInfo("Muhammad","male","Oct21,1998","004","C");
        Student student5 = new Student();
        student5.setInfo("John","male","Jan11,1992","005","D");
        Student student6 = new Student();
        student6.setInfo("May","female","Mar22,1990","006","A");
        Student student7 = new Student();
        student7.setInfo("Jasion","female","Jun29,1994","007","B");
        Student student8 = new Student();
        student8.setInfo("Hong","male","Feb10,1988","008","B");
        Student student9 = new Student();
        student9.setInfo("JJ","male","May21,1998","009","C");
        Student student10 = new Student();
        student10.setInfo("Joy","male","July01,1992","010","D");
        Student[] arr = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        ArrayList<Student> students= new ArrayList<>(Arrays.asList(arr));
        for (Student student : students) {
            if (student.grade.equals("A")|| student.grade.equals("B")){
                System.out.print(student.name+",");
            }
        }
        System.out.println();
        ArrayList<Student> maleStudents = new ArrayList<>(students);
        maleStudents.removeIf(student -> student.gender.equals("female"));
        System.out.println(maleStudents);

        ArrayList<Student> femaleStudents = new ArrayList<>(students);
        femaleStudents.removeIf(student -> student.gender.equals("male"));
        System.out.println(femaleStudents);


    }
}
