// // public class sortedandRotatedarray {
// //     public static int search(int arr[],int target,int si,int ei){
// //         if(si>ei){
// //             return -1;
// //         }
// //         //kaam 
// //         //1. mid find karo
// //         int mid=si+(ei-si)/2;

// //         //case found
// //         if(arr[mid]==target){
// //             return mid;
// //         }
// //         //mid on L1
// //         if(arr[si]<=arr[mid]){
// //             //case a: left
// //             if(arr[si]<=target && target<=arr[mid]){
// //                 return search(arr,target,si,mid);
// //             }else{
// //                 //case b :right
// //                 return search(arr,target,mid+1,ei);
// //             }
// //         }
// //           //mid on L2
// //         else{
// //             //case c:right
// //             if(arr[mid]<=target && target <= arr[ei]){
// //                 return search(arr,target,mid+1,ei);
// //             }
// //             else{
// //                 //case c:left
// //                 return search(arr,target,si,mid-1);
// //             }
// //         }
// //     }
// //     public static void main(String args[]){
// //         int arr[]={4,5,6,7,0,1,2};
// //         int target=0 ; //jiske about rotate kiya hai  -> output =4;
// //         int targetidx= search(arr,target,0,arr.length-1);
// //         System.out.println(targetidx);
// //     }
// // }
// public class sortedandRotatedarray {

//     public static int search(int arr[], int target, int si, int ei) {
//         if(si>ei){
//             return -1;
//         }
//         //mid
//         int mid = si + (ei - si) / 2;

//         //case 0: mid
//         if (arr[mid] == target) {
//             return mid;
//         }

//         //case 1: found on L1
//         if (arr[si] < arr[mid]) {
//             if (arr[si] <= target && target <= arr[mid]) {
//                 return search(arr, target, si, mid);
//             } else {
//                 return search(arr, target, mid + 1, ei);
//             }

//         } else //case 2: found on L2
//         {
//             if (arr[mid] <= target && target <= arr[ei]) {
//                 return search(arr, target, mid+1, ei);
//             } else {
//                 return search(arr, target, si, mid - 1);
//             }
//         }       
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 5, 6, 7, 0, 1, 2};
//         int target = 0;
//         int targetidx = search(arr, target, 0, arr.length - 1);
//         System.out.print(targetidx);
//     }
// }



