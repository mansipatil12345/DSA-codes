//Q1
// public class Assignment{
//     public static void printArray(String arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergesort(String arr[],int si,int ei){
//         if(si>=ei){
//             return ;
//         }
//         int mid=si+(ei-si)/2;
//         mergesort(arr,si,mid);
//         mergesort(arr,mid+1,ei);
//         merge(arr,mid,si,ei);
//     }

//     public static void merge(String arr[],int mid,int si,int ei){
//         String temp[]=new String[ei-si+1];
//         int i=si; //left iterator 
//         int j=mid+1; //right iterator 
//         int k=0;

//         while(i<=mid && j<=ei){
//             if(arr[i].compareTo(arr[j])<0){
//                 temp[k]=arr[i];
//                 i++;
//             }else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i<=mid){
//             temp[k++]=arr[i++];
//         }

//          while(j<=ei){
//             temp[k++]=arr[j++];
//         }

//         for(k=0,i=si;k<temp.length;k++,i++){
//             arr[i]=temp[k];
//         }
//     }

//     public static void main(String args[]){
//         String arr[]={"sun","earth","mars","mercury"};
//         mergesort(arr,0,arr.length-1);
//         printArray(arr);
//     }
// }


//Q2
//BF  -> t.c O(n^2)
// public class Assignment{
//     public static int majorityelement(int arr[]){
//         int n =arr.length;
//         for(int i=0;i<n;i++){
//             int count=0; 
//             for(int j=0;j<n;j++){ //this loop is for counting ,it will be j=0 coz element at i=0 poisition will be counted as 1 
//                                  // eg [3,2,3] i=0 is 3 then j=0 it counts el 3 as 1
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2){
//                 return arr[i];
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int arr[]={3,2,3};
//         System.out.print(majorityelement(arr));
//     }
// }

//Better 
//t.c _> O(n) like loop is running n times and for every opertion it has O(1) so total t.c -> n*O(1)=O(n)
// addition space s.c->O(n)
// import java.util.HashMap;

// public class Assignment{

//     public static int majorityelement(int arr[]){
//         int n = arr.length;
//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0;i<n;i++){//->O(n)
//             if(map.containsKey(arr[i])){ //-> O(1) .containsKey
//                 int count = map.get(arr[i]);
//                 map.put(arr[i],count+1);
//             }
//             else{
//                 map.put(arr[i],1);//-> O(1).put
//             }

//             if(map.get(arr[i])>n/2){//-> O(1).get
//                 return arr[i];
//             }
//         }

//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={2,2,3,3,1,2,2};
//         System.out.println(majorityelement(arr));
//     }
// }


//optimzed -> Moore's voting Algo
//1. apply moores
//2. verfiy element is majority or not 
//t.c-> O(n) + O(n)-> O(n)

// public class Assignment{
//     public static int majorityelement(int nums[]){
//         int count =0;
//         int ele = 0;
//         int n =nums.length;
//         for(int i=0;i<n;i++){ //-> O(n)
//             if(count==0){ //-> O(1)-> constant-time check they are not loop
//                 count=1;
//                 ele=nums[i];
//             }
//             else if(nums[i]==ele){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//         }

//         int count1=0;
//         for(int i=0;i<n;i++){ //-> O(n) 
//             if(nums[i]==ele){
//                 count1++;
//             }
//             if(count1>n/2){
//                 return ele;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int nums[]={3,2,3};
//         System.out.print(majorityelement(nums));
//     }
// }




//Q3
//Brute force Approach  T.c->O(n^2)

//condition of inversion count
//inversion count-> arr[i]>arr[j] for i<j

// public class Assignment{
//     public static int CountInversion(int arr[]){
//         int invcount=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]){
//                     invcount++;
//                 }
//             }
//         }
//         return invcount;
//     }
//     public static void main(String[] args) {
//         int arr[]={6,3,5,2,7};
//         System.out.println(CountInversion(arr));
//     }
// }


//InversionCount:
// Foranarray,inversion count indicate showfar(orclose)the array is from being sorted.
// If the array is alreadysorted
// then
// the inversion count is 0.
// Ifanarrayissorted in the reverse order then the inversion count is the maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j



//optimize sol
//using mergesort
//t.c-> O(nlogn)
//s.c->O(n)-> due to temporary array
//merge sort is good coz we use divide and conquer and compare the elements easily 
//Merge sort can count many inversions in one step without checking each pair.


//why we didnt use Quick sort
//Quick sort:

// swaps elements randomly

// does not compare left half vs right half systematically

// no structured merge step

// Because of this:

// We cannot efficiently count how many elements are greater across partitions.

// To count inversions in quick sort we would still need extra comparisons, leading back to O(n²)


public class Assignment{
    public static int mergesort(int arr[],int si,int ei){
        if(si<ei){
        int mid = si+(ei-si)/2; //-> we use this formula coz another can cross the limit or integer overflow when value of si and ei is large
        //Integer overflow happens when a number becomes larger than the maximum value a data type can store (or smaller than the minimum value).
        //For Java int: 32 bits are used.-> can store 0 or 1 so value -> 2^32 = 4.2 billion stores bothe pos, neg numbers
        int leftInvCount = mergesort(arr, si, mid);
        int rightInvCount = mergesort(arr, mid+1, ei);

        int invCount = merge(arr,si,mid,ei);
        return leftInvCount + rightInvCount + invCount;
        }
        return 0;
    }


    public static int merge(int arr[],int si,int mid,int ei){

        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k =0;
        int invcount =0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
                invcount+= mid-i+1;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];  
        }

        return invcount;
    }

    public static void main(String[] args) {
        int arr[]={6,3,5,2,7};
        System.out.println(mergesort(arr, 0, arr.length-1));
    }
}

//draw that flowchart 

//write work write algo and important points , time complexities  dry runs , flow charts 