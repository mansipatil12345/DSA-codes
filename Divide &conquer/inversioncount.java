public class inversioncount{
    public static int merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int invcount=0;

        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                invcount+= mid-i+1;
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

        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

        return invcount;
    }

    public static int mergesort(int arr[],int si,int ei)
    {

        if(ei>si){
            int mid=si+(ei-si)/2;

            int leftcount=mergesort(arr,si,mid);
            int rightcount=mergesort(arr,mid+1,ei);
            int invcount=merge(arr,si,mid,ei);

            return leftcount+rightcount+invcount;

        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};

        System.out.println(mergesort(arr,0,arr.length-1));
    }
}