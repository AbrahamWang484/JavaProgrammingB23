package day48_Recap.cybertekTask;

import java.time.LocalDate;

public final class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attend instructors meetings");

    }



}