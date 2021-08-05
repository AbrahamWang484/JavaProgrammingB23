package day39_CustomClass_Statics.team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        testersList.add(tester);
    }


    //    method 1: add Array to ArrayList
    public void addTesters(Tester[] testers){
      Collections.addAll(testersList,testers);

    }
    // method 2:add Array to ArrayList
//    public void addTesters(Tester[] testers) {
//        for (Tester tester : testers) {
//            testersList.add(tester);
//        }

    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        Collections.addAll(devopsList,developers);
    }

    public void removeTester(long employeeID){
        testersList.removeIf(tester -> tester.employeeID==employeeID);
    }

    public void removeDeveloper(long employeeID){
        devopsList.removeIf(developer -> developer.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO's name= " + PO +
                ", BA's name= " + BA +
                ", SM's name= " + SM +
                ", number of testers= " + testersList.size() +
                ", number of devops= " + devopsList.size() +
                '}';
    }
}

 /*
 create a class called ScrumTeam
           Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = new ArrayList<>();
                ArrayList<Developer> devopsList = new ArrayList<>();
               int daysOfSprint;

             Actions:
                  setInfo(): sets the names of PO, BA, SM
                  addTester(Tester tester): adds the given tester to the testers ArrayList

                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
                 removeTester(long employeeID): removes the given tester from the testers ArrayList

                 removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                  toString(): prints number of tester,& developers,  PO name, SM name, BA name
  */