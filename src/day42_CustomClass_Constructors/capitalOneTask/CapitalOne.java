package day42_CustomClass_Constructors.capitalOneTask;

import day41_CustomClass_Constructor.Developer;
import day41_CustomClass_Constructor.ScrumTeam;
import day41_CustomClass_Constructor.Tester;

public class CapitalOne {

    public static void main(String[] args) {
        ScrumTeam scrumTeam1 = new ScrumTeam("Zengin", "Engin", "Cengiz");
        scrumTeam1.hireTester(HumanResource.testersTeam1);
        scrumTeam1.hireDeveloper(HumanResource.devopsTeam1);

        ScrumTeam scrumTeam2 = new ScrumTeam("Selda", "Mucahit", "Dilem");
        scrumTeam2.hireTester(HumanResource.testersTeam2);
        scrumTeam2.hireDeveloper(HumanResource.devopsTeam2);

        ScrumTeam scrumTeam3 =new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
        scrumTeam3.hireTester(HumanResource.testersTeam3);
        scrumTeam3.hireDeveloper(HumanResource.devopsTeam3);

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);
        System.out.println(scrumTeam3);

        System.out.println("----------------------------------------");

        ScrumTeam[] scrums = {scrumTeam1, scrumTeam2, scrumTeam3};
        double budget = 0;
        double maxSalaryOfTester = scrums[0].testers.get(0).salary;
        int numOfTesters=0;
        int numOfDevelopers=0;
        for (ScrumTeam eachScrumTeam : scrums) {
            numOfTesters+=eachScrumTeam.testers.size();
            numOfDevelopers+=eachScrumTeam.developers.size();
            for (Tester tester : eachScrumTeam.testers) {
                budget +=tester.salary;
            }

            for (Developer developer : eachScrumTeam.developers) {
                budget += developer.salary;
            }


        }
        System.out.println("budget = " + budget);
        System.out.println("numOfTesters = " + numOfTesters);
        System.out.println("numOfDevelopers = " + numOfDevelopers);



    }

}

/*
        1. total budget
        2. total Number of testers in CapitalOne
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the testers
        5. what's the max & min salaries of the developers
 */