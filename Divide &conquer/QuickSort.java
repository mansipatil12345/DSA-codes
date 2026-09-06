
// // public class QuickSort {
// //     public static void printArr(int arr[]) {
// //         for (int i = 0; i < arr.length; i++) {
// //             System.out.print(arr[i]+" ");
// //         }
// //         System.out.println();
// //     }
// //     public static void Quicksort(int arr[], int si, int ei) {
// //         if (si >= ei) {
// //             return;
// //         }
// //         int pidx = partition(arr, si, ei);
// //         Quicksort(arr, si, pidx - 1); //left
// //         Quicksort(arr, pidx + 1, ei); //right 
// //     }
// //     public static int partition(int arr[], int si, int ei) {
// //         int pivot = arr[ei];
// //         int i = si - 1; //to make place for els smaller than pivot 
// //         for (int j = si; j < ei; j++) {
// //             if (arr[j] <= pivot) {
// //                 i++;
// //                 //swap
// //                 int temp = arr[i];
// //                 arr[i] = arr[j];
// //                 arr[j] = temp;
// //             }
// //         }
// //         i++;
// //         int temp = pivot;
// //         arr[ei] = arr[i]; 
// //         arr[i] = temp; //pivot = arr[i] nahi likhna hai !
// //         return i;
// //     }
// //     public static void main(String args[]) {
// //         int arr[] = {6, 3,9, 8, 2, 5};
// //         Quicksort(arr, 0, arr.length - 1);
// //         printArr(arr);
// //     }
// // }

// public class QuickSort {

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void QuickSort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int pivotidx = partition(arr, si, ei);
//         QuickSort(arr, si, pivotidx - 1);
//         QuickSort(arr, pivotidx + 1, ei);

//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = si - 1;
//         for (int j = si; j < ei; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 //swap
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;

//     }

//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 8, 2, 5};
//         QuickSort(arr, 0, arr.length - 1);
//         printArr(arr);
//     }
// }




