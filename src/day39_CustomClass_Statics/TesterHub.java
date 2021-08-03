package day39_CustomClass_Statics;

class Tester{
public String name, employeeID, JobTitle;
public int salary;

    public void setInfo(String name, String employeeID, String JobTitle, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    public void smokeTesting(){

    }

    public void creatingTicket(){

    }

    public void dailyStandUp(){

    }

    public String toString() {
        return "Tester{" +
                "name='" + name +
                ", employeeID='" + employeeID +
                ", JobTitle='" + JobTitle +
                ", salary=" + salary +
                '}';
    }
}

public class TesterHub {
    public static void main(String[] args) {

    }
}
