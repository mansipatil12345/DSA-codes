import java.util.*;
public class LargestSubarr {

    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};  //O(n) better than brute force app with O(n^2)t.c
        HashMap<Integer,Integer> map = new HashMap<>();
        //map storing sum,idx
        int sum =0;
        int len= 0;

        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println("largest Subarray with sum 0 is => "+len);
    }
}



