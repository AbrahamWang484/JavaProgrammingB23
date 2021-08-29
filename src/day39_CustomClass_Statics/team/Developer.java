package day39_CustomClass_Statics.team;

class Developer{
    public String name, JobTitle;
    public int salary;
    public long employeeID;

    public void setInfo(String name, long employeeID, String JobTitle, int salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is responsible for coding.");
    }

    public void unitTesting(){
        System.out.println(name +" is responsible for unit test");
    }

    public void fixingBug(){
        System.out.println(name +" is responsible for fixing the bugs");
    }

    public String toString() {
        return "Developers{" +
                "name='" + name +
                ", employeeID='" + employeeID +
                ", JobTitle='" + JobTitle +
                ", salary=" + salary +
                '}';
    }
}

/*
create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary
          Actions:
            setInfo(), coding(), unitTesting(), fixingBug(), toString()
 */