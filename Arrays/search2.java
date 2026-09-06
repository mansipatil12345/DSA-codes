// public class search2 {
//     public static int BinarySearch(int number[],int key){
//         int start= 0;
//         int end = number.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(number[mid]==key){
//                 return mid;
//             }
//             if(number[mid]<key){
//                 start=mid+1;
//             }
//             else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int number[]={1,4,5,8,9,10,90};
//         int key=90;
//         System.out.println("Number is at Index:"+BinarySearch(number,key));
//     }
// }

