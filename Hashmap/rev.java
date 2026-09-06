import java.util.*;
public class rev {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert -> O(1)
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US",50);
        // System.out.println(hm);
        // //Get -> O(1) - if found then it returns value
        // int population = hm.get("India");
        // System.out.println(population);
        // //Get -> O(1) - otherwise it returns null
        // System.out.println(hm.get("Indonesia"));
        // //ContainsKey -> O(1) -> true or false 
        // System.out.println(hm.containsKey("India"));

        //Remove-> O(1)
        // System.out.println(hm.remove("China"));//if the value i want to delete is in map it returns that value
        // System.out.println(hm.remove("Indonesia")); //if i deleted a value whcih is not in map it returns "null"
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear(); //it clears the hm
        System.out.println(hm.isEmpty());//-> return true or false as answer
    }
}
