
// import java.util.ArrayList;

// // import java.util.ArrayList;

// // public class revision {
// //     // public static int storeWater(ArrayList<Integer> height){
// //     //     int maxWater = 0; //if only one line is there it requres two lines to store water so humn -infinity ke 
// //     //     //jagah 0 le liya

// //     //     //brute force -> O(n^2)
// //     //     for(int i=0;i<height.size();i++){//O(n)
// //     //         for(int j=i+1;j<height.size();j++){  //O(n-> n-1 ->n-2)
// //     //             int ht = Math.min(height.get(i),height.get(j));
// //     //             int width=j-1;
// //     //             int currWater = ht*width;
// //     //             maxWater = Math.max(maxWater,currWater);
// //     //         }
// //     //     }
// //     //     return maxWater;
// //     // }

// //     //optimized one  -? two pointer app
// //     public static int storeWater(ArrayList<Integer> height){
// //         int maxWater =0;
// //         int lp =0;
// //         int rp = height.size()-1;
// //         while(lp<rp){
// //             //calculate water area
// //             int ht = Math.min(height.get(lp),height.get(rp));
// //             int width = rp-lp;
// //             int currwater = ht*width;
// //             maxWater= Math.max(maxWater,currwater);

// //             //update the ptr
// //             if(height.get(lp)<height.get(rp)){
// //                 lp++;
// //             }else{
// //                 rp--;
// //             }
// //         }

// //         return maxWater;
// //     }
// //    public static void main(String[] args) {
// //     //ClassName objectName = new ClassName();
// //     ArrayList<Integer> height = new ArrayList<>();

// //     height.add(1);
// //     height.add(8);
// //     height.add(6);
// //     height.add(2);
// //     height.add(5);
// //     height.add(4);
// //     height.add(8);
// //     height.add(3);
// //     height.add(7);

// //     System.out.println(storeWater(height));

// //     }
// // }



// // import java.util.ArrayList;

// // public class revision {
   

  
// //     // public static boolean pairsum(ArrayList<Integer> list,int target){
// //     //    for(int i=0;i<list.size();i++){
// //     //         for(int j=i+1;j<list.size();j++){
// //     //             if(list.get(i)+list.get(j)==target){
// //     //                 return true;
// //     //             }
// //     //         }
        
// //     //    }
// //     //    return false;
// //     // }

// //     //optmized
// //     public static boolean pairsum(ArrayList<Integer> list,int target){
// //         int lp = 0;
// //         int rp= list.size()-1;

// //         while(lp!=rp){
// //             //case 1
// //             if(list.get(lp)+list.get(rp)==target){
// //                 return true;
// //             }

// //             //case 2
// //             if(list.get(lp)+list.get(rp)<target){
// //                 lp++;
// //             }

// //             //case3
// //             if(list.get(lp)+list.get(rp)>target){
// //                 rp--;
// //             }
// //         }
// //         return false;
// //     }
// //    public static void main(String[] args) {
// //     //ClassName objectName = new ClassName();
// //     ArrayList<Integer> list = new ArrayList<>();

// //     list.add(1);
// //     list.add(2);
// //     list.add(3);
// //     list.add(4);
// //     list.add(5);
// //     list.add(6);
// //     int target = 50;
   

// //     System.out.println(pairsum(list,target));

// //     }
// // }



// // import java.util.ArrayList;
// // public class revision {
   
// //     //optmized
// //     public static boolean pairsum(ArrayList<Integer> list,int target){
// //        int bp =-1;
// //        for(int i=0;i<list.size();i++){
// //             if(list.get(i)>list.get(i+1)){
// //                 bp = i;
// //                 break;
// //             }
// //        }

// //        int lp = bp+1;
// //        int rp = bp;
// //        int n = list.size();

// //        while(lp!=rp){
// //             //case 1
// //             if(list.get(lp)+list.get(rp)==target){
// //                 return true;
// //             }

// //             if(list.get(lp)+list.get(rp)<target){
// //                 lp = (lp+1) % n;
// //             }else{
// //                 rp=(n+rp-1) % n;
// //             }
// //        }
// //        return false;
// //     }
// //    public static void main(String[] args) {
// //     //ClassName objectName = new ClassName();
// //     ArrayList<Integer> list = new ArrayList<>();
// //  //rotated
// //     list.add(11);
// //     list.add(15);
// //     list.add(6);
// //     list.add(8);
// //     list.add(9);
// //     list.add(10);
// //     int target = 100;
   

// //     System.out.println(pairsum(list,target));

// //     }
// // }


// // import java.util.ArrayList;
// // import java.util.Collections;
// // public class revision{
// //     public static ArrayList<Integer> lonelynumbers(ArrayList<Integer>list){
// //         Collections.sort(list);
// //         ArrayList<Integer>nums = new ArrayList<>();


// //         //to avoid duplications
// //         for(int i=1;i<list.size()-1;i++){
// //             //prev+1 <curr && curr+1<next
// //             if(list.get(i-1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i+1)){
// //                 nums.add(list.get(i));
// //             }
// //         }

// //         //single ele
// //         if (list.size()==1){
// //             nums.add(list.get(0));
// //         }

// //         //number >1 -> if two elements are there
// //         if(list.size()>1){
// //             //first element of the list
// //             if(list.get(0) + 1 < list.get(1)){
// //                 nums.add(list.get(0));
// //             }

// //             //last element of the list
// //             if(list.get(list.size()-2) + 1 < list.get(list.size()-1)){
// //                 nums.add(list.get(list.size()-1));
// //             }
// //         }
// //         return nums;
// //     }    

// //     public static void main(String[] args) {
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(10);
// //         list.add(6);
// //         list.add(5);
// //         list.add(8);
// //         System.out.println(lonelynumbers(list));
        
// //     }
// // }


// // import java.util.ArrayList;

// // public class revision{
// //     public static ArrayList<Integer> beautifularray(int n){
// //         ArrayList<Integer> ans = new ArrayList<>();
// //         ans.add(1);
// //         for(int i=2;i<=n;i++){
// //             ArrayList<Integer> temp = new ArrayList<>();
// //             for(Integer e:ans){
// //                 if(2*e<=n){
// //                      temp.add(2*e);
// //                 }
// //             }

// //             for(Integer e:ans){
// //                 if(2*e-1<=n){
// //                      temp.add(2*e-1);
// //                 }
// //             }

// //             ans = temp;
// //         }
// //         return ans;
// //     }
// //     public static void main(String[] args) {
// //         int n =4;
// //         System.out.print(beautifularray(n));

// //     }
// // }

// public class revision{
//     public static void DivideandConq(int start,int increment,ArrayList<Integer> res,int n){
//         if(start+increment>n){
//             res.add(start);
//             return;
//         }

//         DivideandConq(start, 2*increment, res, n);
//         DivideandConq(start+increment, 2*increment, res, n);

//     }

//     public static ArrayList<Integer> beautifulArray(int n){
//          ArrayList<Integer> res = new ArrayList<>();
//          DivideandConq(1, 1, res, n);
//          return res;

//     }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.print(beautifulArray(n));

//     }
// }