package day26_MultiDimensionalArray;

import java.util.Arrays;

public class ExeWarmUp1 {
    public static void main(String[] args) {

/*
        int i=0;
        for (int each : array) {
            if (each!=0){
                result[i]=each;
                i++;
            }
        }
        System.out.println(Arrays.toString(result));

 */
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] result = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}








/*
write a program that can move all the zeros to the end of the array
		Ex:
			array = {10, 0, 5, 0, 1, 0};
			output:
				{10, 5, 1, 0, 0, 0}
 */