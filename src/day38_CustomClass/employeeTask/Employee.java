package day38_CustomClass.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public String name;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }



//    employeeName.addAll(Arrays.asList("Ahmed","Wang","Muhammad","Zhang"));
//    gender.add
//
//
////and n number of products
//for(
//    int i = 0;
//    i<n;i++)
//
//    {
////adding elements to each ArrayList
//        pid.add(id_i);
//        pname.add(name_i);
//        pavailability.add(availability_i);
//        pprice.add(price_i);
//        prating.add(rating_i);
}

/*/*
Employees:
    Attributes:
        employeeName, gender, employeeID, JobTitle, Salary

    Actions:
        attendMeeting, Working, toString, SetInfo

    ArrayList of employees:
        1. remove all the employtees who are makeing lass than 100K
        2. remove all the QAs

 */