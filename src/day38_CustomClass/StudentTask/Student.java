package day38_CustomClass.StudentTask;

public class Student {
    public String name,gender,dateOfBirth,studentID,grade;

    public void setInfo(String name, String gender, String dateOfBirth, String studentID, String grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name= " + name  +
                ", gender= " + gender +
                ", dateOfBirth= " + dateOfBirth +
                ", studentID= " + studentID +
                ", grade= " + grade +
                '}';
    }
}
