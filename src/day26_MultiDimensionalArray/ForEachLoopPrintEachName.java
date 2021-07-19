package day26_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoopPrintEachName {
    public static void main(String[] args) {
        String[][][][][] names ={ { {{{"Wang","Yu"},{"Ma","Zhang"}},{{"Si","Liu"}}}, { { {"La","Mi"},{"Sao","jie"} }}} };
        for (String[][][][] each4D : names) {
            for (String[][][] each3D : each4D) {
                for (String[][] each2D : each3D) {
                    for (String[] each1D : each2D) {
                        for (String element : each1D) {

                            System.out.println(element);

                        }
                    }

                }
            }

        }


        System.out.println(Arrays.deepToString(names));
    }
}
/*
use for each loop to print each names of the given arrya:

String[][][][][] names ={ { {{{"Wang","Yu"},{"Ma","Zhang"}},{{"Si","Liu"}}}, { { {"La","Mi"},{"Sao","jie"} }}} };
                                                                                       0              1
          1D                         0             1
          2D                               0                       1                        0
          3D                                        0                                              1
          4D                                                     0
 */
