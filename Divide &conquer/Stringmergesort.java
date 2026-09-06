public class Stringmergesort {
    public static void printArray(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(String arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,mid,si,ei);
    }

    public static void merge(String arr[],int mid,int si,int ei){
        String temp[]=new String[ei-si+1];
        int i=si; //left iterator 
        int j=mid+1; //right iterator 
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

         while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String args[]){
        String arr[]={"sun","earth","mars","mercury"};
        mergesort(arr,0,arr.length-1);
        printArray(arr);
    }
}
