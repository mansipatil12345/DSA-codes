// public class Mergesort {
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergesort(int arr[],int si,int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid=si+(ei-si)/2;
//         mergesort(arr,si,mid); //left
//         mergesort(arr,mid+1,ei); //right 
//         merge(arr,si,mid,ei);
//     }
//     public static void merge(int arr[],int si,int mid,int ei){
//         int temp[]=new int[ei-si+1]; //always a +1 coz si=0 se start ho raha hai 
//                                         //for ex -> left =(0,3)= 4 and right = (4,6)=3 -> 6-3+1 = 7 size ka array +1 isliye kara 
//                                         //coz index 0 se start hota hai

//         int i=si; //iterator for left part 
//         int j=mid+1; //iterator for right part
//         int k=0; //iterator for temp arr
//         while(i<=mid && j<=ei){
//             if(arr[i]<arr[j]){
//                 temp[k]=arr[i];
//                 i++;
//             }
//             else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//              k++;
//         }
//         //left part  //kuch value agar bach gaye toh 
//         while(i<=mid){
//             temp[k++]=arr[i++];
//         }
//         //right part 
//         while(j<=ei){
//             temp[k++]=arr[j++];
//         }
//         //copying to orginal array
//         for(k=0,i=si;k<temp.length;k++,i++){
//             arr[i]=temp[k];
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={6,3,9,5,2,8};
//         mergesort(arr,0,arr.length-1);
//         printArray(arr);
//     }
// }


