package day10_IfStatements;

public class TripInfo {
    public static void main(String[] args) {
        int grade = 7;
        String info = "";

        if (grade>=1 && grade <= 6){
            if (grade == 1){
                info ="\n\t\t\t        grade - 1\n" +
                        "\t\t\t        location -  Apple orchard\n" +
                        "\t\t\t        number of groups - 3\n" +
                        "\t\t\t        teacher in charge - Ms. Smith";
            }else if (grade ==2){
                info ="\n\t\t\t        grade - 2\n" +
                        "\t\t\t        location - Zoo\n" +
                        "\t\t\t        number of groups - 7\n" +
                        "\t\t\t        teacher in charge - Mr. Lee";
            }else if (grade ==3){
                info ="\n\t\t\t        grade - 3\n" +
                        "\t\t\t        location - Aquarium\n" +
                        "\t\t\t        number of groups - 5\n" +
                        "\t\t\t        teacher in charge - Ms. Wilson";
            }else if (grade ==4){
                info ="\n\t\t\t        grade - 4\n" +
                        "\t\t\t        location - Movie theater  \n" +
                        "\t\t\t        number of groups - 2\n" +
                        "\t\t\t        teacher in charge - Ms. Reyes";
            }else if (grade ==5){
                info ="\n\t\t\t        grade - 5\n" +
                        "\t\t\t        location - Museum \n" +
                        "\t\t\t        number of groups - 5\n" +
                        "\t\t\t        teacher in charge - Ms. Lela";
            }else {
                info ="\n\t\t\t       grade - 6\n" +
                        "\t\t\t        location - Six Flags\n" +
                        "\t\t\t        number of groups - 8\n" +
                        "\t\t\t        teacher in charge - Mr. Watt";
            }
        }else {
            info ="invalid grade number, please verification it and try again.";
        } System.out.println(info);
    }
}
/*
4. Your school goes on a Field trip each year. The place you go will be based on your grade. Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

			    Data based on grade:

			        grade - 1
			        location -  Apple orchard
			        number of groups - 3
			        teacher in charge - Ms. Smith

			        grade - 2
			        location - Zoo
			        number of groups - 7
			        teacher in charge - Mr. Lee

			        grade - 3
			        location - Aquarium
			        number of groups - 5
			        teacher in charge - Ms. Wilson

			        grade - 4
			        location - Movie theater
			        number of groups - 2
			        teacher in charge - Ms. Reyes

			        grade - 5
			        location - Museum
			        number of groups - 5
			        teacher in charge - Ms. Lela

			        grade - 6
			        location - Six Flags
			        number of groups - 8
			        teacher in charge - Mr. Watt
 */
