
import java.util.*;

public class MaximumCountwithkey {

    public static int findmaximumcount(ArrayList<Integer> nums, int key) {
        int count[] = new int[1000];
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                count[nums.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (count[i] > max) {
                max=count[i];
                ans=i+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        int key = 2;
        System.out.print(findmaximumcount(nums, key));
    }
}
