package JavaAllInOne;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] highScores = { 10, 9, 8, 8};
        String[] names = {"Jamal", "Emily", "Destiny", "Mateo"};
// for each loop: for each value in highScores
// Format: for (type variable : arrayname){  }
        for (int value : highScores)
        {
            // Notice no index or [ ], just the variable value!
            System.out.println( value );
        }
// for each loop with a String array to print each name
// the type for variable name is String!
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}
