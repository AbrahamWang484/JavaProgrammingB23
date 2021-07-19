package day25_ForEachLoop;

public class UniqueElements2 {

    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'A', 'C', 'A', 'D', 'D'};
        //first get each element
        for( char each : chars) {
            int count = 0;
            //use each element compare with each element
            for (char character : chars) {
                if (character == each) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println(each);
                //break; if want to get the first unique one
            }

        }

    }

}