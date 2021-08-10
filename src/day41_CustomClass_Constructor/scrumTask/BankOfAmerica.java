package day41_CustomClass_Constructor.scrumTask;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Yuliang", 'M', "QA", 10, 110000);
        Tester tester2 = new Tester("Abbos", 'M', "SM", 11, 115000);
        Tester tester3 = new Tester("Selda", 'F', "QE", 12, 120000);

        Tester[] testers = {tester2, tester3};


        Developer developer1 = new Developer("Zorana", 'F', "Software Developer",13, 125000);
        Developer developer2 = new Developer("Mehmet", 'M', "Java Developer", 14, 130000);
        Developer developer3 = new Developer("Yuliia", 'F', "Software Developer", 15, 125005);
        Developer developer4 = new Developer("Yasin", 'M', "Java Developer", 16, 122000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam("Shazia", "Fhilipp", "Aysu");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);

        scrum1.hireTester(  new Tester("Tugba", 'F', "SDET", 9, 118000)  );

        System.out.println(scrum1);

        double budget = 0;

        for(Tester eachTester  : scrum1.testers){
            budget += eachTester.salary;
        }

        for (Developer eachDeveloper : scrum1.developers) {
            budget +=  eachDeveloper.salary ;
        }

        System.out.println("budget = " + budget);

        ScrumTeam scrum2 =new ScrumTeam("Colin", "Wade", "Taylor"); // add 5 testers & 6 developers
        Tester[] testers2 = {new Tester("Oz",'M',"QA",21,110000),
                new Tester("Farhad",'M',"QA",22,100000),
                new Tester("Nastuallah",'M',"QA",23,105000),
                new Tester ("Rina",'F',"SDET",24,90000)};

        scrum2.hireTester(testers2);

        Developer[] developers2 = {new Developer("Mike",'M',"Senior Developer",25,110000),
                new Developer("David",'M',"Developer",26,100000),
                new Developer("Jacob",'M',"Developer",27,105000),
                new Developer ("Edison",'F',"Developer",28,90000),
                new Developer ("Florian",'M',"Developer",29,80000)};

        scrum2.hireDeveloper(developers2);

        ScrumTeam scrum3 =new ScrumTeam("Fred", "Jade", "Alexander"); // add 2 testers & 4 developers
        Tester[] testers3 = {new Tester("Robin",'M',"QA",31,110000),
                new Tester("Clay",'M',"QA",32,100000)};

        scrum2.hireTester(testers2);

        Developer[] developers3 = {new Developer("Mike",'M',"Senior Developer",35,110000),
                new Developer("Harvey",'M',"Developer",36,100000),
                new Developer("Linden",'M',"Developer",37,105000),
                new Developer ("Linda",'F',"Developer",38,90000)};

        scrum2.hireDeveloper(developers2);

        ScrumTeam[] scrumTeams ={scrum1, scrum2, scrum3};

        int buget1 =0;
        int numOfTesters = 0;
        int numOfDevelopers =0;
        double maxSalaryTester = Double.MIN_VALUE;
        //double maxSalaryOfTester = scrums[0].testers.get(0).salary;
        double minSalaryTester =Double.MAX_VALUE;
        double maxSalaryDeveloper = Double.MIN_VALUE;
        double minSalaryDeveloper = Double.MAX_VALUE;
        for (ScrumTeam eachScrum : scrumTeams) {
            numOfTesters +=eachScrum.testers.size();
            numOfDevelopers += eachScrum.developers.size();
            for (Tester tester : eachScrum.testers) {
                buget1 += tester.salary;
                if (maxSalaryTester<tester.salary){
                    maxSalaryTester=tester.salary;
                }
                if (minSalaryTester>tester.salary){
                    minSalaryTester=tester.salary;
                }
            }
            for (Developer developer : eachScrum.developers) {
                buget1 += developer.salary;
                if (maxSalaryDeveloper<developer.salary){
                    maxSalaryDeveloper=developer.salary;
                }
                if (minSalaryDeveloper>developer.salary){
                    minSalaryDeveloper=developer.salary;
                }
            }
        }
        System.out.println("bugets1 = " + buget1);
        System.out.println("numOfDevelopers = " + numOfDevelopers);
        System.out.println("numOfTesters = " + numOfTesters);
        System.out.println("minSalaryDeveloper = " + minSalaryDeveloper);
        System.out.println("maxSalaryDeveloper = " + maxSalaryDeveloper);
        System.out.println("minSalaryTester = " + minSalaryTester);
        System.out.println("maxSalaryTester = " + maxSalaryTester);


     /*   1. total budget
        2. total Number of testers in Bank of America
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the tester
        5. what's the max & min salaries of the developers
    */


    }

}