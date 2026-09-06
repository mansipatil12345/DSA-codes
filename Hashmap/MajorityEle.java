import java.util.*;
public class MajorityEle {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i],1);
            // }

            //we can also use getOrDefault method for this  -> if arr[i](key) present so return the value otherwise get the default value lastly add+1 to update the values

            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        // Set<Integer> keySet = map.keySet(); // instead of defining the keyset and storing is not imp
                    // you can use it in for loop
        for(Integer key: map.keySet()){    
            if(map.get(key)> arr.length/3){
                System.out.println(key);
            }
        }

    }
}
