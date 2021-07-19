package day23_Arrays;

public class ArraysPractise {
    public static void main(String[] args) {

        //DataType[] variableName = {data1, data2, data3 ...};

        String[] group1 = {"Feruza", "Yuliang", "Tamara", "Ahmet"};
        //          index:   0           1           2         3

        // retrieve data from array:
        System.out.println(group1[0]);
        System.out.println(group1[1]); // Yuliang
        System.out.println(group1[2]); // Tamara
        System.out.println(group1[3]);

        System.out.println("---------------------------------------------");

        for (int i = 0; i <= 3; i++) {
            System.out.println(group1[i]);


            for(String each : group1){
                System.out.println(each);
            }
        }
    }
}
/*
create one array named group1, list 4 names in the array. then print all
 */
