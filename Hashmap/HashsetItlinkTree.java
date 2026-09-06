// import java.util.*;
// public class HashsetIt {

//     public static void main(String[] args) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Noida");

//         // approach 1
//         Iterator it = cities.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }

//         // approach2
//         for(String city:cities){
//             System.out.println(city);
//         }
//     }
    
// }


// import java.util.*;
// public class HashsetItlinkTree{
//     public static void main(String[] args) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Noida");
//         cities.add("Bengaluru");
//         System.out.print(cities);      
        
//         // Iterator it = cities.iterator();
//         // while(it.hasNext()){
//         //     System.out.println(it.next());
//         // }

//         // for(String city:cities){
//         //     System.out.println(city);
//         // }

//         LinkedHashSet<String> lhs = new LinkedHashSet<>(); //maintains insertion order
//         lhs.add("Delhi");
//         lhs.add("Mumbai");
//         lhs.add("Noida");
//         lhs.add("Bengaluru");
//         System.out.println(lhs);

//         TreeSet<String> ts = new TreeSet<>(); //sorted in ascending order
//         ts.add("Delhi");
//         ts.add("Mumbai");
//         ts.add("Noida");
//         ts.add("Bengaluru");
//         System.out.println(ts);

//     }
// }