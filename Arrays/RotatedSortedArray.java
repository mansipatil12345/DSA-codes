public class RotatedSortedArray {

    public static int RotatedSortedArr(int nums[],int target){
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            //calculate mid
            int mid=start+(end-start)/2;
            //check the mid
            if(nums[mid]==target){
                return mid;
            }

            //left sorted to check compare with start element
            if(nums[start]<=nums[mid]){ //(arr[start]<=arr[mid])->'=' is not required to add as already told unique elements are there 
            //but for better practice always use '=' to cover edge cases like for arr of size 2
            //start == mid so above cond fails and it assumes that it is right sorted but its not true we should cover edge cases
                if((nums[start]<=target && target <nums[mid])){ //and here '<' is used instead of '<=' coz already we said if it is equal to mid return that so it shoudl be less the mid-1
                    //left search
                    end = mid-1;
                }
                else{
                    //right search 
                    start = mid+1;
                }
            }
            //right sorted
            else{
                if((nums[mid]<target && target<=nums[end])){
                    //right search
                    start=mid+1;
                }
                else{
                    //left search
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[]={3,1};
        int target=1;
        System.out.print(RotatedSortedArr(nums, target));
    }
    
}
