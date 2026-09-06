public class selection {
   
    public static void selectionsort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minposition=i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[minposition]>arr[j])//increasing for decreasing arr[minposition]<arr[j] it will take out the max value from the array
                {
                    minposition=j;
                }
            }
            //swap
            int temp = arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printArray(arr);
    }
   
}




