import java.util.*;
public class PairSum {
    //BruteForce -O(n^2)
    // public static boolean pairsum(ArrayList<Integer>list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //two pointer Approach -O(n)
    // works if array is sorted 1,2,3,4,5 rp decrease hoga to values kum hogi toh sum kum hoga , and lp ko increase karenge toh  values increase hogi and sum increase hoga 
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            //case 1
            if(sum==target){
                return true;
            }

            //case 2
            if(sum<target){
                lp++;
            }
            //case 3
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(pairsum(list,target));
    }
}
