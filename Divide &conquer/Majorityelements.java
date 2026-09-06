public class Majorityelements {
    public static int countInRange(int nums[],int num,int si,int ei){
        int count=0;
        for(int i=si;i<=ei;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int nums[],int si,int ei){
        if(si==ei){
            return nums[si];
        }

        int mid=(ei-si)/2+si;
        int left=majorityElementRec(nums,si,mid);
        int right=majorityElementRec(nums,mid+1,ei);

        if(left==right){
            return left;
        }

        int leftcount=countInRange(nums,left,si,ei);
        int rightcount=countInRange(nums,right,si,ei);

        return leftcount>rightcount ? left:right;
    }

    public static int majorityElement(int nums[]){
        return majorityElementRec(nums,0,nums.length-1);
    }

    public static void main(String args[]){
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
