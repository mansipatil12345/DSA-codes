import java.util.*;

public class HashmapOp {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("China",100);
        hm.put("India",150);
        hm.put("US",50);

        // //print 
        // System.out.println(hm);


        // //Get the hashmap ->O(1)
        // int population=hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));


        // //contains key ->O(1)->true or false  -> O(1)
        // System.out.println(hm.containsKey("India"));//->true
        // System.out.println(hm.containsKey("Indonesia"));//->false;

        // //remove ->O(1)
        // System.out.println(hm.remove("India")); //->return the value of deleted key
        // System.out.println(hm);


        //to iterate over keys 
        //we form "set" first to iterate
        Set<String> keys = hm.keySet();  //->will conatins keys only 
        System.out.println(keys);

        //we use a for each loop to iterate over a set
        for (String k : keys){          //->keys se ek ek key nikalkar k me store hogi
            System.out.println("key="+k+","+",value="+hm.get(k));
        }
    }
}
