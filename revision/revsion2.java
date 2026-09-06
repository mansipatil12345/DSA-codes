public class revsion2 {
    public static void bubblesort(int arr[]){
        int n = arr.length;
        for(int turn =0;turn<n-1;turn++)
        {
            for(int j=0;j<n-turn-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

    }
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;i<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        
    }
    public static void main(String[] args) {
        int arr[] ={5,4,2,3,1};
        selectionsort(arr);
        printarray(arr);
    }   
}
