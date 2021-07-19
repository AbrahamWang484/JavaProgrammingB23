package day26_MultiDimensionalArray;

public class Exe_CommonElement {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};

        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1==each2){
                    System.out.print(each1 + " ");
                }
            }
        }
        System.out.println();
        System.out.println("------------------");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
/*
2.Write a program that can print out the common elements from two integer array
          Ex:
              arr1={1,2,3,4,5};
              arr2= {4,5,6,7,8};

          output:
              4 5

          solution 1:
              DO NOT use for each loop

          solution 2:
              MUST use for each loops
 */