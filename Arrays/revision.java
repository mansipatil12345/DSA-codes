
//         int marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//         marks[0]= sc.nextInt();
//         marks[1]= sc.nextInt();
//         marks[2]= sc.nextInt();
//         System.out.println("phy: "+ marks[0]);
//         System.out.println("chem: "+ marks[1]);
//         System.out.println("math: "+ marks[2]);
//         //length ke liye for marks .length
//         System.out.println("length of array="+marks.length);
//     }
// }
// public class revision{
//     public static int linear_search(int numbers[],int key){
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//             return -1;
//     }
//     public static void main(String[] args) {
//        int numbers[]={2,4,6,8,10,12,14,16};
//        int key=10;
//        int index=linear_search(numbers,key);
//        if(index==-1){
//         System.out.print("Not found key");
//        }
//        System.out.println("found key at index: "+index);
//     }
// }
// public class revision{
//     public static int linear_search(String good[],String key){
//         for(int i=0;i<good.length;i++){
//             if(good[i].equals(key)){
//                 return i;
//             }
//         }
//             return -1;
//     }
//     public static void main(String[] args) {
//        String good[]={"hello","bye","kaise_ho"};
//         String key="kaise_ho";
//         int index=linear_search(good,key);
//        if(index==-1){
//         System.out.print("Not found key");
//        }else{
//         System.out.println("found key at index: "+index);
//        }
//     }
// }
// public class revision{
//     // public static int get_largest(int numbers[]){
//     //     int largest = Integer.MIN_VALUE;
//     //     for(int i=0;i<numbers.length;i++){
//     //         if(numbers[i]>largest){
//     //             largest=numbers[i];
//     //         }
//     //     }
//     //     return largest;
//     // }
//     // public static int get_smallest(int numbers[]){
//     //     int smallest = Integer.MAX_VALUE;
//     //     for(int i=0;i<numbers.length;i++){
//     //         if(numbers[i]<smallest){
//     //             smallest=numbers[i];
//     //         }
//     //     }
//     //     return smallest;
//     // }
//     public static int binarySearch(int numbers[],int key){
//         int start=0;
//         int end=numbers.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start=mid+1; //right
//             } 
//             else{   
//                 end=mid-1;   //left
//             }
//         }
//         return -1;
//     }
//     public static void reverse_array(int numbers[]){
//         int first = 0;
//         int last = numbers.length-1;
//         while(first<last){
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//       int numbers[]={2,4,6,8,10};
//     //   System.out.println("Largest is :"+get_largest(numbers));
//     //   System.out.println("smallest is :"+get_smallest(numbers));
//     // int key=10;
//     // System.out.println("index for key is:" + binarySearch(numbers,key));
//     reverse_array(numbers);
//     for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }
// }
// public class revision {

//     public static void print_subarray(int numbers[]) {
        
//         int maxsum = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 int currsum=0;
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(numbers[k] + " ");

//                     currsum = currsum + numbers[k];
//                     if (currsum > maxsum) {
//                         maxsum = currsum;
//                     }
//                 }
//                 System.out.print("sum is:" + currsum);
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("max sum is :"+maxsum);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         print_subarray(numbers);
//     }
// }



// public class revision{
// //    public static void maxsubarray_sum(int numbers[]){
// //     int currsum=0;
// //     int maxsum=Integer.MIN_VALUE;
// //     int prefix[]=new int[numbers.length];

// //     prefix[0]=numbers[0];
// //     for(int i=1;i<prefix.length;i++){
// //         prefix[i]=prefix[i-1]+numbers[i];
// //     }
// //     for(int i=0;i<numbers.length;i++){
// //         for(int j=i;j<numbers.length;j++){
// //             currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];

// //             if(currsum>maxsum){
// //                 maxsum=currsum;
// //             }
// //         }
        
// //     }
// //     System.out.println("max sum is:"+maxsum);
// // }

// public static void kadanes(int numbers[]){
//     int ms = Integer.MIN_VALUE;
//     int cs=0;

//     for(int i=0;i<numbers.length;i++){
//         cs=cs+numbers[i];
//         if(cs<0){
//             cs=0;
//         }
//         ms=Math.max(cs,ms);
//     }
//     System.out.println("our max subarray sum is :"+ms);
// }

//     public static void main(String[] args) {
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//         kadanes(numbers);
//     }
// }


// public class revision{
//     public static boolean atleasttwice(int num[]){
//         for(int i=0;i<num.length;i++){
//            for(int j=i+1;j<num.length;j++){
//                 if(num[i]==num[j]){
//                     return true;
//                 }
//            }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int num[]={1,2,3};
//         System.out.println(atleasttwice(num));
//     }
// }


//Binary search

// public class revision{
//     public static int trapping_water(int height[]){
//         int n = height.length;
//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for(int i=0;i<n;i++){
//             leftmax[i]= Math.max(height[i],leftmax[i-1]);
//         }

//         int rightmax[]= new int[n];
//         rightmax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i]=Math.max(height[i],rightmax[i+1]);
//         }
       
//         int trapped_water=0;
//         for(int i=1;i<n;i++){
//             int water_level=Math.min(leftmax[i],rightmax[i]);
//             trapped_water += water_level-height[i];
//         }
//         return trapped_water;
//     }

//     public static void main(String args[]){
//         int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
//         System.out.println(trapping_water(height));
//        }
// }


// //bubble sort 
// public class revision{
//     public static void bubblesort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }

//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         bubblesort(arr);
//         printarr(arr);
//     }
// }



//bubble sort 
// public class revision{
//     public static void bubblesort(int arr[])
//     {
//         for(int i=0;i<arr.length;i++){
//             boolean swapped = false;
//             for(int j=0;j<arr.length-i-1;j++){  

//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]= arr[j+1] ;
//                     arr[j+1]=temp;   
                    
//                     swapped=true;
//                 }
                
//             }
//             if(!swapped){
//                 break;
//             }
//         }
//     }

//     public static void selectionsort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos = i;

//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minPos]<arr[j]){
//                     minPos = j;
//                 }
//             }
//             int temp = arr[minPos];
//             arr[minPos]=arr[i];
//             arr[i]= temp;
//         }
//     }

//     public static void insertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int curr = arr[i];
//             int prev =i-1;
//             while(prev>=0 && arr[prev]>curr){
//                 arr[prev+1]=arr[prev];
//                 prev--;
//             }
//             arr[prev+1]=curr;
//         }
//     }

//     public static void Counting_sort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             largest = Math.max(largest,arr[i]);
//         }

//         int count[]= new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }

//         int j=0;
//         for(int i=count.length-1;i>=0;i--){
//             while(count[i]>0){
//                 arr[j]=i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printarr(int arr[])
//     {
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
    
//     public static void main(String args[]){

//         int arr[] = {1,4,1,3,2,4,3,7};
//     //    Arrays.sort(arr,0,3);
//     //    printarr(arr);
//     Counting_sort(arr);
//     printarr(arr);
//     }
// }



