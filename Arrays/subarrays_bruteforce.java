public class subarrays_bruteforce{
    public static void printsubarray(int numbers[]){
       int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                int cursum=0;
                for(int k=start;k<=end;k++)
                {
                    cursum+=numbers[k];
                    System.out.print(numbers[k]+" ");
                    
                }
                System.out.println("Sum is :"+cursum);
                System.out.println();
                if(maxsum<cursum)
                {
                   maxsum=cursum;
                }     
           }
            System.out.println();
        }
        System.out.println("Maxsum is :"+maxsum);
    }

    public static void main(String[] args)
    {
        int numbers[]={2,4,6,8,10};
        printsubarray(numbers);
    }
}






















