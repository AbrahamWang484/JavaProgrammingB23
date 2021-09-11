package day44_Recap.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam{

    private String PO;
    private String BA;
    private String SM;
    private ArrayList<Tester> testers;
    private ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO= '" + PO + '\'' +
                ", BA= '" + BA + '\'' +
                ", SM= '" + SM + '\'' +
                ", number of testers= " + testers.size() +
                ", number of developers= " + developers.size() +
                '}';
    }

    public void hireTester(Tester tester){
        testers.add(tester);
    }

    public void hireTester(Tester[] testers){
        this.testers.addAll( Arrays.asList(testers) );
    }

//    public void removeTester(int id){
//        testers.removeIf(tester -> tester.id == id );
//    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void hireDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

//    public void removeDeveloper(int id){
//        developers.removeIf( developer -> developer.id ==id );
//    }


}