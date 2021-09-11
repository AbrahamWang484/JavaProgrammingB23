package day48_Recap.cybertekTask;

import java.time.LocalDate;

public class Cybertek {

    public static void main(String[] args) {

        Tester tester = new Tester("Yasin", 'M', LocalDate.of(1995, 5, 28), 11, "SDET", 110000);
        tester.eat("Steak");
        tester.drink("Coffee");
        tester.sleep();
        tester.work();
        tester.attendMeeting();

        System.out.println(tester);
        System.out.println("----------------------------------------------");
        Developer developer = new Developer("Mucahit", 'M', LocalDate.of(1992, 6, 16), 12, "Java Developer", 120000);
        developer.eat("");
        developer.drink("");
        developer.sleep();
        developer.work();
        developer.attendMeeting();

        System.out.println(developer);
        System.out.println("----------------------------------------------");
        Teacher teacher= new Teacher("Asiya", 'F', LocalDate.of(1996, 8, 19), 18, "Softskill Teacher", 130000);
        teacher.eat("");
        teacher.drink("");
        teacher.sleep();
        teacher.work();
        teacher.attendMeeting();

        System.out.println(teacher);
        System.out.println("----------------------------------------------");
        Student student = new Student("Yuliia", 'F', LocalDate.of(1996, 7, 19), "Cybetek", 28);
        student.eat("");
        student.drink("");
        student.sleep();
        //  student.work();
        //  student.attendMeeting();
        student.study();
        student.attendClass();
        System.out.println(student);

    }


}