package day39_CustomClass_Statics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CybertekSchool {
    public static void main(String[] args) {
        Student[] group1 = {new Student(), new Student(), new Student(), new Student()};
        group1[0].setInfo("Davut", 'M', 123, 'A');
        group1[1].setInfo("Ali", 'M', 43, 'B');
        group1[2].setInfo("Ivan", 'M', 34, 'B');
        group1[3].setInfo("Lily", 'F', 67, 'C');


        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(group1));

       Predicate<Student> condition = p->p.grade=='C'|| p.grade=='B';
//        students.removeIf( p->p.grade=='C');
//        students.removeIf( p->p.grade=='B');
        students.removeIf(p->p.grade=='C'|| p.grade=='B');

        //List<Student> result= students.stream().filter(student -> student.grade=='A').and(student -> student.grade=='B').collect(Collectors.toList());
        System.out.println(students);




       // System.out.println(students);
//        for (Student each : students) {
//            students.removeIf(p -> p.grade=='A');
//        }
       /// System.out.println(students);

    }


}
