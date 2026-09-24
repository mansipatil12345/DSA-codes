// import java.util.*;
// public class Practice4{
//     public static void main(String args[]){
//         int marks[]=new int[50];
//         // int numbers[]={1,2,3,4,5};
//         // int morenumbers[]={4,5,6};
//         // String fruits[]={"apple","banana","orange"};
//         //until orignal values are stored uptil that int array has 0's , string has ''(all have nul values according to their datatypes)
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("phy: "+marks[0]);
//         System.out.println("Chem: "+marks[1]);
//         System.out.println("Maths: "+marks[2]);

//         //updated
//         // marks[2] = marks[2]+1;

//         int percentage = (marks[0]+marks[1]+marks[2]/3);
//         System.out.println("Percentage: "+percentage+"%");

//         //calculating the length
//         System.out.println("Length is :"+marks.length);

//     }
// }


//arrays follow pass by reference (this makes changes in original array) 
// but variables passed follow pass by value change in varable doesnt reflect in main function
// public class Practice4{
//     public static void update(int marks[],int nonchangeablevalue){
//         nonchangeablevalue = 10;
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int nonchangeablevalue = 2;
//         int marks[]={97,98,99};
//         update(marks,nonchangeablevalue);
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }
//         System.out.println("NV: "+nonchangeablevalue);
//     }
// }

//time complexity and space complexity 
// Time -> time taken by the algo to excute each set of instruction
// space complexity -> amount of space or memory taken by an algo to run as fucntin length of input

//Linear Search
// public class Practice4{
//     public static int LinearSearch(int arr[],int key){
//         for(int i=0;i<arr.length;i++){ //O(n)
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int key = 4;
//         int arr[]={2,4,6,8,10,12,14,16};
//         int result = LinearSearch(arr, key);
//         System.out.println("Result: "+result);
//     }
// }


// public class Practice4{
//     public static int Largestnumber(int arr[]){
//         int max =Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){ //O(n)
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14,16};
//         int result = Largestnumber(arr);
//         System.out.println("Result: "+result);
//     }
// }


// public class Practice4{
//     public static int smallestnumber(int arr[]){
//         int min =Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){ //O(n)
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         return min;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14,16};
//         int result = smallestnumber(arr);
//         System.out.println("Result: "+result);
//     }
// }

//Binary Search -> works on sorted array 

// public class Practice4{   //O(log2n)
//     public static int binarySearch(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;
       
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]==key){
//                 return mid;
//             }
//             if(key<arr[mid]){
//                 end = mid-1;
//             }else if(key>arr[mid]){
//                 start = mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int key = 12;
//         int arr[]={2,4,6,8,10,12,14};
//         int result = binarySearch(arr, key);
//         System.out.println("Result: "+result);
//     }
// }

//reverse 
// public class Practice4{  //O(n/2)->O(n)(by removing constant)
//     public static void Reverse(int arr[]){
//         int start = 0;
//         int end = arr.length-1;
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end]=temp;

//             start++;
//             end--;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14};
//         Reverse(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//pairs in array
// public class Practice4{// t.c -> O(n^2)
//     public static void pairs(int arr[]){
//         int tp=0;
//         for(int i=0;i<arr.length;i++){
//             int curr = arr[i];
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print("("+curr+","+arr[j]+")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total pairs is: "+tp);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         pairs(arr);

//     }
// }

//formula of tp -> n(n-1)/2 (remember this )
 
//subarray -> continuous part of array  //O(n^3)
// public class Practice4{
//     public static void pairs(int arr[]){
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         int ts = 0; //total subarray
//         for(int i=0;i<arr.length;i++){
//             int start = i;
//             for(int j=i;j<arr.length;j++){
//                 int end = j;
//                 int sum = 0; //to reset sum for every subarray to 0 we write it here
//                 for(int k=start;k<=end;k++){
//                     System.out.print(arr[k]+" "); //subarray
//                     sum+=arr[k];
//                 }
//                 if(sum>max){
//                     max = sum;
//                 }
//                 if(sum<min){
//                     min = sum;
//                 }
//                 ts++;
//                 System.out.println("sum is: "+sum);
//             }
//             System.out.println();
//         }
//         System.out.println("Total subarray = "+ts);
//         System.out.println("Min is: "+min);
//         System.out.println("Max is: "+max);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         pairs(arr);
//     }
// }