// public class Revision{

//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void quickSort(int arr[],int si,int ei){

//         if(si>=ei){
//             return;
//         }
//        int pidx= partition(arr,si,ei);
//        quickSort(arr, si, pidx-1);
//        quickSort(arr, pidx+1, ei);
//     }

//     public static int partition(int arr[],int si,int ei){
//         int pivot = arr[ei];

//         int i = si-1; //make place for el smaller than pivot
//         for(int j=si;j<ei;j++){
//             if(arr[j]<=pivot){
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j]=arr[i];
//                 arr[i]=temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei]=arr[i];  //pivot = arr[i];(pivot nahi likhenge coz voh toh variable hai)
//         arr[i]=temp;
//         return i;
//     }

//     public static void main(String[] args) {
//         int arr[]={6,3,9,8,2,5};
//         quickSort(arr, 0, arr.length-1);
//         printArr(arr);
//    }
// }


// public class Revision{
//     public static void printarr(String arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergesort(String arr[],int si,int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid = si+(ei-si)/2;
//         mergesort(arr, si, mid);
//         mergesort(arr,mid+1,ei);
//         merge(arr,si,mid,ei);
//     }

//     public static void merge(String arr[],int si,int mid,int ei){
//         String temp[]=new String[ei-si+1];

//         int i=si;
//         int j=mid+1;
//         int k=0;

//         while(i<=mid && j<=ei){
//             //string to string comparison
//             //0 -> equal
//             //+ve -> a>b
//             //-ve -> a<b
//             if(arr[i].compareTo(arr[j])<0){
//                 temp[k]=arr[i];
//                 i++;
//             }
//             else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i<=mid){
//             temp[k++]=arr[i++];
//         }

//         while(j<=ei){
//             temp[k++]=arr[j++];
//         }

//         for(i=si,k=0;k<temp.length;i++,k++){
//             arr[i]=temp[k];
//         }
//     }

//     public static void main(String[] args) {
//         String arr[]={"sun","earth","mars","mercury"};
//         mergesort(arr, 0, arr.length-1);
//         printarr(arr);

//     }
// }


