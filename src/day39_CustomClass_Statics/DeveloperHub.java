package day39_CustomClass_Statics;

class Developer{
    public String name, employeeID, JobTitle;
    public int salary;

    public void setInfo(String name, String employeeID, String JobTitle, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    public void coding(){

    }

    public void unitTesting(){

    }

    public void fixingBug(){

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
public class DeveloperHub {
}
/*
create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary
          Actions:
            setInfo(), coding(), unitTesting(), fixingBug(), toString()
 */