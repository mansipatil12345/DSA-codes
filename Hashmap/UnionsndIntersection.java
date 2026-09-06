// import java.util.*;
// public class UnionsndIntersection {
//     public static void main(String args[]){
//         int arr1[]={7,3,9};
//         int arr2[]={6,3,9,2,9,4};
//         HashSet<Integer> set = new HashSet<>();
//         //union
//         for(int i=0;i<arr1.length;i++){  // in this t.c is O(n+m)
//             set.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             set.add(arr2[i]);
//         }
//         System.out.println("union is ("+set.size() +"elements):"+set);
//         //intersection
//         set.clear();                                //in this t.c is O(n+m) so total is O(n+m)
//         for(int i=0;i<arr1.length;i++){
//             set.add(arr1[i]);
//         }

//         System.out.print("Intersection is: ");
//         int count=0;
//         for(int i=0;i<arr2.length;i++){
//             if(set.contains(arr2[i])){
//                 count++;
//                 set.remove(arr2[i]);
//                 System.out.print(arr2[i]+" ");
//             }
//         }
//         System.out.println("Count of intersection: "+ count);
//     }
// }
