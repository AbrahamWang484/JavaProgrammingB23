
package day48_Recap.cybertekTask;

import java.time.LocalDate;

public final class Tester extends Employee{


    public Tester(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6~7 hours");
    }
}

/*
1. Tester
        variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary
        methods: work(), attendMeeting()
 */