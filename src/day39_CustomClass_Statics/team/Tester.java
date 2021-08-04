package day39_CustomClass_Statics.team;

class Tester{
    public String name, JobTitle;
    public int salary;
    public long employeeID;

    public void setInfo(String name, long employeeID, String JobTitle, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name +" is responsible for smoking test.");
    }

    public void creatingTicket(){
        System.out.println(name + " is responsible for creating the ticket.");
    }

    public void dailyStandUp(){
        System.out.println(name + " is responsible daily stand up");
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