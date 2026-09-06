import java.util.*;
public class Linkedhashmapprac{
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm =  new LinkedHashMap<>();
        lhm.put("India",140);
        lhm.put("China",130);
        lhm.put("US",50);
        System.out.println(lhm); //order is according to insertion

       TreeMap<String ,Integer> tm = new TreeMap<>();
       tm.put("India",100);
       tm.put("China",120);
       tm.put("US",50);
       System.out.println(tm);   //here all keys are sorted according to keys -> alphabetic order 
    }
}