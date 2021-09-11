package day44_Recap.ScrumTask;

public class Tester {

    private String name;
    private char gender;
    private String jobTitle;
    private int id;
    private double salary;

    private static boolean isCybertekStudent;
    private static boolean isEmployeed;

    static{
        isCybertekStudent = true;
        isEmployeed = true;
    }

    public Tester(String name, char gender, String jobTitle, int id, double salary) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
    }

    public String toString() {
        return "Tester{" +
                "name= '" + name + '\'' +
                ", gender= " + gender +
                ", jobTitle= '" + jobTitle + '\'' +
                ", id= " + id +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
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

    public static boolean isIsCybertekStudent() {
        return isCybertekStudent;
    }

    public static boolean isIsEmployeed() {
        return isEmployeed;
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
