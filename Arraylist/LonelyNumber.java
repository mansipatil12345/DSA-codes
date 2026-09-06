import java.util.*;

public class LonelyNumber{

    public static ArrayList<Integer> findlonelyNumber(ArrayList<Integer> nums) {
        Collections.sort(nums); //O(nlogn)
        ArrayList<Integer> list = new ArrayList<>();
        //for multiple elements
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        //if only one element is there 
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }

        if (nums.size() > 1) {
            //firstelement of list 
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            //lastelement of list 
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        System.out.print(findlonelyNumber(nums));
    }
}  