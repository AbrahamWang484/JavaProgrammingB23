package day31_Recap;

public class isContained {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int num = 7;
        System.out.println(isContained(array, num));
    }

    public static boolean isContained(int[] array, int num) {
        for (int element : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
}
/*
5. create a return method named contains that accepts one integer array and one integer, returns true if the integer is contained in the array, otherwise returns false
			Ex: array = {1,2,3,4,5}
				num = 5;

				contains(array, num) ==> true
 */