package day39_CustomClass_Statics;


public class Student {
    public String name;
    public char gender;
    public int studentId;
    public char grade;

    public void setInfo(String name, char gender, int studentId, char grade) {
        this.name = name;
        this.gender = gender;
        this.studentId = studentId;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }

    //    public String toString() {
//
////        return "Student{" +
////                "name='" + name + ''' +
////        ", gender=" + gender +
////                ", studentId=" + studentId +
////                ", grade=" + grade +
////                '}';
//    }
}