package day42_CustomClass_Constructors;

public class Employee {
    public String name, jobTitle;
    public int id;
    public double salary;
    public Employee(){}
    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, String jobTitle){
        //this.name=name;
        this(name);
        this.jobTitle= jobTitle;
    }
    public Employee(String name, String jobTitle, int id){
        this(name,jobTitle);
        this.id= id;
    }
    public Employee(String name, String jobTitle, int id, double salary){
        this(name, jobTitle, id);
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
