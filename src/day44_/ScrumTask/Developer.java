package day44_.ScrumTask;


public class Developer {

    private String name;
    private char gender;
    private String jobTitle;
    private int id;
    private double salary;

    private static boolean isEmployeed ;
    private static boolean hatesTaster ;

    static{
        isEmployeed = true;
        hatesTaster = true;
    }

    public Developer(String name, char gender, String jobTitle, int id, double salary) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void fixingBugs(){
        System.out.println(name+" is crying");
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setId(int id) {
        if (id<=0){
            return;
        }
        this.id = id;
    }

    public void setSalary(double salary) {
        if (salary<0){
            return;
        }
        this.salary = salary;
    }
}