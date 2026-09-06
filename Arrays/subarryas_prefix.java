public class subarryas_prefix {
    public static void Maxsubarraysum(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];

        //calculate prefix array
        for(int i =1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=1;j<numbers.length;j++){
             int end =j;
             //if i =0 then prefix of [-1] ban jayega and -1 index exist nahi karta hence we used this ternary operator 
             currSum= start==0 ? prefix[end]:prefix[end]-prefix[start-1];

             if(maxSum<currSum)
             {
                maxSum=currSum;
             }
            }
        }
        System.out.println("max sum : = "+maxSum);

    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        Maxsubarraysum(numbers);
    }
}
