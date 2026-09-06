// //Ascending order
// import java.util.Arrays;
// public class inbuilt {
   
//     // public static void bubblesort(int arr[])
//     // {
//     //     int n = arr.length;
//     //     for(int i=0;i<n-1;i++){  // i<=n-2
//     //         for(int j=0;j<n-1-i;j++){ //j<=n-2-i
//     //             if(arr[j]>arr[j+1]){
//     //                 int temp = arr[j];
//     //                 arr[j] = arr[j+1];
//     //                 arr[j+1]= temp;
//     //             }
//     //         }
//     //     }
//     // }
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         // bubblesort(arr);
//         Arrays.sort(arr); //inbuilt sorting need not to make any function 
//       Arrays.sort(arr,0,3);
//         printArray(arr);
       
//     }
   
// }
 

//descending order
import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
   
    // public static void bubblesort(int arr[])
    // {
    //     int n = arr.length;
    //     for(int i=0;i<n-1;i++){  // i<=n-2
    //         for(int j=0;j<n-1-i;j++){ //j<=n-2-i
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1]= temp;
    //             }
    //         }
    //     }
    // }
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    // showing yellow we have to use enhanced for loop for that we can write it as in a way like 
    // public static void printArray(Integer arr[]){
    //     for (Integer num : arr) {
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    // }
    
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        // bubblesort(arr);
        // Arrays.sort(arr,Collections.reverseOrder()); //inbuilt sorting need not to make any function 
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArray(arr);
    }
   
}
 

