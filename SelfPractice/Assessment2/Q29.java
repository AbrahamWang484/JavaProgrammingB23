package Assessment2;

public class Q29 {
    public static void main(String[] args) {
        int[] nums = {14, 1, 84, 97, 1243, 46};
        //             0  1   2   3     4   5
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                total += 3;
            } else {
                total += 10;
            }
            if (i % 3 == 0) {
                total -= 15;
            }

        }
        System.out.println(total);
    }
}
