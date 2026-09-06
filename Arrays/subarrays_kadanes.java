
// public class subarrays_kadanes{
//     public static void maxsubarraysum(int numbers[])
//     {
//        int ms = Integer.MIN_VALUE;
//        int cs=0;

//        for(int i=0;i<numbers.length;i++)
//        {
//             cs = cs + numbers[i];
//             if(cs<0){
//                 cs = ms;
//             }
//             ms=Math.max(cs,ms);//compare the values
           
//        }
      
//        System.out.println("our max subarray sum is :"+ms);
//     }


//     public static void main(String[] args) {
//         int numbers[]={-1,-2,-3,-4};
//         maxsubarraysum(numbers);
//     }
// }


// public class subarrays_kadanes {
//     public static void maxsubarraysum(int numbers[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             cs = cs + numbers[i];
//             if (cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(ms, numbers[i]); // Compare with individual element
//         }

//         // If all numbers are negative, ms will be the largest (least negative) number
//         System.out.println("Our max subarray sum is: " + ms);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-1, -2, -3, -4};
//         maxsubarraysum(numbers);
//     }
// }


// optimized and correct kadanes algo(works for -ve no or +ve both)
// public class subarrays_kadanes {
//     public static void maxsubarraysum(int nums[]) {
//         int ms = nums[0];
//         int cs = nums[0];

//         for (int i = 1; i < nums.length; i++) { //->remember to start with =1
//             cs=Math.max(nums[i],nums[i]+cs);
//             ms=Math.max(ms,cs);

//         }
//         System.out.println("Our max subarray sum is: " + ms);
//     }

//     public static void main(String[] args) {
//         int nums[] = {-1};
//         maxsubarraysum(nums);
//     }
// }


//to print that subarray
public class subarrays_kadanes {
    public static void maxsubarraysum(int nums[]) {
        int ms = nums[0];
        int cs = nums[0];

        int start=0;
        int ansstart=0;
        int ansend=0;

        for (int i = 1; i < nums.length; i++) { //->remember to start with i=1
           if(nums[i]>cs+nums[i]){
            cs=nums[i];
            start=i;
           }else{
            cs+=nums[i];
           }

           if(cs>ms){
             ms=cs;
             ansstart=start;
             ansend=i;
           }
        }
        System.out.println("Our max subarray sum is: " + ms);
        System.out.println("Subarray is:");
        for(int i=ansstart;i<=ansend;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxsubarraysum(nums);
    }
}

