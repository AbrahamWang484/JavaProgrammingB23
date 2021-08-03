package day39_CustomClass_Statics;

import java.util.ArrayList;


 class ScrumTeam {
    public String PO, BA, SM;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

     public void sefInfo(String PO, String BA, String SM, ArrayList<Tester> testersList, ArrayList<Developer> devopsList, int daysOfSprint) {
         this.PO = PO;
         this.BA = BA;
         this.SM = SM;
         this.testersList = testersList;
         this.devopsList = devopsList;
         this.daysOfSprint = daysOfSprint;
     }

     public ArrayList addTesters(){

     }


 }
