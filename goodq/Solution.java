
//rearrange array

// public class Solutions{

//     public static int[] rearrangeArray(int nums[]){
//         int n = nums.length;
//         int pos[]= new int[n];
//         int neg[]= new int[n];
//         int p=0,q=0;   //->to keep track of arrays pos and neg

//         for(int i=0;i<n;i++){
//             if(nums[i]>0){
//                 pos[p++]=nums[i];  
//             }else{
//                 neg[q++]=nums[i];
//             }
//         }
//         if(p>q){
//             for(int i=0;i<q;i++){
//                     nums[2*i]=pos[i]; //-> even index
//                     nums[(2*i)+1]=neg[i]; //->odd index
//             }

//             int index = q*2;  //-> to traverse on nums array
//             for(int i=q;i<p;i++){  //-> traversing on postivie array
//                 nums[index]=pos[i];
//                 index++;
//             }
//         }
//         else{
//              for(int i=0;i<p;i++){
//                     nums[2*i]=pos[i]; //-> even index
//                     nums[(2*i)+1]=neg[i]; //->odd index
//             }

//             int index = p*2;  //-> to traverse on nums array
//             for(int i=p;i<q;i++){  //-> traversing on negative array
//                 nums[index]=neg[i];
//                 index++;
//             }
//         }
//         return nums;

//     } 
//     public static void main(String[] args) {
//         int nums[]={-1,2,3,4,-3,1};
//         int ans[]=rearrangeArray(nums);
//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
// }





//Q_2 -> Next Permutation

// public class Solution{
//     public static void swap(int nums[],int a,int b){
//         int temp = nums[a];
//         nums[a]=nums[b];
//         nums[b]=temp;
//     }
//     public static void reverse(int nums[],int si,int ei){

//          while(si<ei){
//             swap(nums,si,ei);
//             si++;
//             ei--;
//          }
//     }

//     public static int[] nextPermutation(int nums[]){
//         int idx=-1;
//         int n=nums.length;
//         for(int i=n-2;i>=0;i--){
//             if(nums[i]<nums[i+1]){
//                 idx=i;
//                 break;
//             }
//         }

//         if(idx==-1){
//             reverse(nums,0,n-1);
//             return nums;
//         }

//         for(int i=n-1;i>idx;i--){
//             if(nums[i]>nums[idx]){
//                 swap(nums,i,idx);
//                 break;
//             }
//         }

//         reverse(nums, idx+1, n-1);
//         return nums;
//     }


//     public static void main(String[] args) {
//         int nums[]={2,1,5,4,3,0,0};
//         int ans[]=nextPermutation(nums);
//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
// }

//Q_3->Set zeroes
// public class Solution{
//     public static int[][] setZeroes(int matrix[][]){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int col0=1;

//        for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(matrix[i][j]==0){
//                 matrix[i][0]=0;
//                 if(j!=0){
//                     matrix[0][j]=0;
//                 }
//                 else{
//                     col0=0;
//                 }
//             }
//         }
//        }

//        for(int i=1;i<n;i++){
//         for(int j=1;j<m;j++){
//             if(matrix[i][0]==0 || matrix[0][j]==0){
//                 matrix[i][j]=0;
//             }
//         }
//        }

//        //edge case
//        if(matrix[0][0]==0){
//             for(int j=0;j<m;j++){
//                 matrix[0][j]=0;
//             }
//        }

//        if(col0==0){
//         for(int i=0;i<n;i++){
//             matrix[i][0]=0;
//         }
//        }

//        return matrix;
//     }
//     public static void main(String[] args) {
//         int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
//         int ansmatrix[][]=setZeroes(matrix);
//         for(int i=0;i<ansmatrix.length;i++){
//             for(int j=0;j<ansmatrix[0].length;j++){
//                 System.out.print(ansmatrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// Q_4-> finding subarray sum == k(given in question)
// import java.util.*;

// public class Solution{
//     public static int subarraySum(int nums[],int k){
//         HashMap <Integer,Integer> map = new HashMap<>();
//         map.put(0,1);
//         int prefixsum=0;
//         int count =0;

//         for(int num:nums){
//             prefixsum+=num;
            
//             if(map.containsKey(prefixsum-k)){
//                 count+=map.get(prefixsum-k);
//             }

//             if(map.containsKey(prefixsum)){
//                 map.put(prefixsum,map.get(prefixsum-k)+1);
//             }
//             else{
//                 map.put(prefixsum,1);
//             }
//         }

//         return count;

//     }
//     public static void main(String[] args) {

//         int nums[]={1,1,1};
//         int k=2;
//         System.out.println(subarraySum(nums, k));   
//     }
// }


//left and righte rotate brute force (and this uses extra space)
// import java.util.*;
// public class Solution{
//     public static void leftrotate(int nums[],int k){
//         int n = nums.length;
//         k = k%n;

//         List<Integer> temp = new ArrayList<>();
//         for(int i=0;i<k;i++){
//             temp.add(nums[i]);
//         }

//         for(int i=k;i<n;i++){
//             nums[i-k]=nums[i];
//         }

//         int idx=n-k;
//         for(int i=0;i<temp.size();i++){
//             nums[idx++]=temp.get(i);
//         }
//     }

//     public static void printarr(int nums[]){
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int nums[]={1,2,3,4,5,6,7};
//         int k=3;
//         leftrotate(nums, k);
//         printarr(nums);
//     }
// }


 //right
// import java.util.*;
// public class Solution{
//     public static void rightrotate(int nums[],int k){
//         int n = nums.length;
//         k = k%n;

//         List<Integer> temp = new ArrayList<>();
//         for(int i=n-k;i<n;i++){
//             temp.add(nums[i]);
//         }

//         for(int i=n-k-1;i>=0;i--){
//             nums[i+k]=nums[i];
//         }

//         for(int i=0;i<temp.size();i++){
//             nums[i]=temp.get(i);
//         }
//     }

//     public static void printarr(int nums[]){
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int nums[]={1,2,3,4,5,6,7};
//         int k=3;
//         rightrotate(nums, k);
//         printarr(nums);
//     }
// }

// (optimized one go to leetcode (for right))
//left is here (these are inplace rotation without using extra approach)
// public class Solution {

//     public static void reverse(int nums[], int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void leftRotate(int nums[], int k) {
//         int n = nums.length;
//         k = k % n;   // mandatory

//         // left rotation steps
//         reverse(nums, 0, k - 1);
//         reverse(nums, k, n - 1);
//         reverse(nums, 0, n - 1);
//     }

//     public static void printarr(int nums[]) {
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int nums[] = {1, 2, 3, 4, 5, 6, 7};
//         int k = 3;
//         leftRotate(nums, k);
//         printarr(nums);
//     }
// }
