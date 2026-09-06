
// public class assignment {
//     public static boolean containsDuplicate(int arraynum[]) {
//         for (int i = 0; i < arraynum.length; i++) {
//             for (int j = i + 1; j < arraynum.length; j++) {
//                 if (arraynum[i] == arraynum[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         int arraynum[] = {1, 2, 3, 1};
//         System.out.print(containsDuplicate(arraynum));
//     }
// }



// if we want to print true and false then use boolean


// public class assignment {
//     public static int containsDuplicate (int arraynum[])
//     {
//         for(int i =0;i<arraynum.length;i++)
//         {
//            for(int j =i+1;j<arraynum.length;j++)
//            {
//             if(arraynum[i]==arraynum[j])
//             {
//                return 1;
//             }
//            }
//         }
//         return 0;
//     }
// public static void main(String args[])
// {
//     int arraynum[]= {1,2,3,1};

//     System.out.print(containsDuplicate(arraynum));
// }
// }


// public class assignment{
//     public static int rotation(int arraynum[],int target){
//         for(int i =0;i<arraynum.length;i++){
//             if(arraynum[i]==target){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arraynum[]={4,5,6,7,0,1,2};
//         int target = 3;
//         int index=rotation(arraynum,target);
//         System.out.print(index);
//     }
// }


// public class assignment
// {
//     public static int buyandsell(int prices[])
//     {
//         int buy = Integer.MAX_VALUE;
//         int maxprofit=0;
//         for(int i=0;i<prices.length;i++)
//         {
//             if(buy<prices[i])
//             {
//                 int profit = prices[i]-buy;
//                 maxprofit=Math.max(profit,maxprofit);
//             }
//             else{
//                 buy=prices[i];
//             }
//         }
//         return maxprofit;
//     }

//     public static void main(String[] args) 
//     {
//         int prices[]={7,6,4,3,1};
//         System.out.print(buyandsell(prices));
//     }

// }


public class assignment{
    public static int trappedwater(int height[])
    {
        int n = height.length;
        int leftmax[]= new int[n];
            leftmax[0]= height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }



        int rightmax[]= new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        for(int i = 0;i<n;i++)
        {
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
           trappedwater += waterlevel-height[i];
        }
        return trappedwater;

    }

    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(trappedwater(height));
    }
}