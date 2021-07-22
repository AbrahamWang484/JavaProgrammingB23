package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate Eid=LocalDate.of(2021,7,20);
        System.out.println("Eid = " + Eid);

        LocalDate today= LocalDate.now();
        System.out.println(today);

        System.out.println("---------------------");

        //create aray of String to stroe 5 classmates's names & DoB;
        String[] names = {"John","Daniel","Josh","Jimmy"};
        LocalDate[] DoB= {LocalDate.of(1990,5,25),
                LocalDate.of(1980,3,2),
                LocalDate.of(1993,5,13),
                LocalDate.of(1984,2,21)
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s birthday is "+DoB[i]);
        }

        System.out.println("---------------------");

        LocalDate person1= LocalDate.of(1980,2,3);
        LocalDate person2= LocalDate.of(1999,3,4);

        if (person1.isBefore(person2)){
            System.out.println("person1 is elder");
        }else {
            System.out.println("person2 is elder");
        }

        if (person1.isAfter(person2)){
            System.out.println("person1 is younger");
        }else {
            System.out.println("person2 is younger");
        }

        System.out.println("--------------------");

        boolean r1= person1.isLeapYear();
        System.out.println(r1);

        boolean r2= LocalDate.of(2023,1,1).isLeapYear();
        System.out.println(r2);

        System.out.println("-------------------");

        LocalDate currentDate= LocalDate.now();

        System.out.println(currentDate);

        LocalDate unitAssessment3= currentDate.plusDays(14);
        System.out.println(unitAssessment3);

        LocalDate unitAssessment4 = currentDate.plusMonths(6);
        System.out.println(unitAssessment4);

        LocalDate ExamDate=currentDate.plusWeeks(5);
        System.out.println(ExamDate);

    }
}
