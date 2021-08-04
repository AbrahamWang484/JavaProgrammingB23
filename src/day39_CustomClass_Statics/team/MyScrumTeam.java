package day39_CustomClass_Statics.team;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Oz Stark",100001,"SDET",110000);
        testers[1].setInfo("Bakhtyar",100002,"SDET",105000);
        testers[2].setInfo("Yuliang Wang",100003,"SDET",100000);
        testers[3].setInfo("Oleg",100004,"SDET",950000);
    }
}
