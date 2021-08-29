package day39_CustomClass_Statics.team;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Santiago",100001,"Test Engineer",110000);
        testers[1].setInfo("Bakhtyar",100002,"Test Analyst",105000);
        testers[2].setInfo("Muhammet Sengez",100003,"Automation Engineer",100000);
        testers[3].setInfo("Oleg",100004,"Quality Analyst",950000);
        ArrayList<Tester> testersList = new ArrayList<>(Arrays.asList(testers));

        Developer[] developers ={new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Davut Dogan",200001,"Developer",110000);
        developers[1].setInfo("Vusal Rahimli",200002,"DevOps Developer",105000);
        developers[2].setInfo("Farhad Zeynalov",200003,"Front-end Developer",100000);
        developers[3].setInfo("Nasratullah Sarabi",200004,"Full Stack Developer",110000);
        ArrayList<Developer> devopsList = new ArrayList<>(Arrays.asList(developers));

        ScrumTeam scrumTeam= new ScrumTeam("Oz Stark","Yuliang Wang","Dontrell Andrews");
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);
        System.out.println(scrumTeam.devopsList);
    }
}
