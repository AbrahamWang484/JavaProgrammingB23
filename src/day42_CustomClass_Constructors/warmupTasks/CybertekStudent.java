package day42_CustomClass_Constructors.warmupTasks;

public class CybertekStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName, filedOfStudy, programmingLanguage;

    public CybertekStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static{
        schoolName = "Cybertek School";
        filedOfStudy = "IT";
        programmingLanguage = "Java";
    }

    public void attendClass(){
        System.out.println(name+" is attending class at "+schoolName);
    }

    public void replit(){
        System.out.println(name+" is working on "+programmingLanguage+" repl.its");
    }

    public void askForBreak(){
        System.out.println(name+" is asking for break");
    }


    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                ", filedOfStudy='" + filedOfStudy + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
	3. create a class named CybertekStudent
			Variables:
				instance: name, age, gender,
				static: schoolName,fieldOfStudy, programmingLanguage
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			methods:
				attendClass():
				replit()
				toString()
 */