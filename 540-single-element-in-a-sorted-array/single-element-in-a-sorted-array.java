class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left  = 0;
        int right = n-1;
        //Boundry Condition : 
        if(right==0) return nums[0];
        else if(nums[0] != nums[1]){
            return nums[0];
        }
        else if(nums[right] != nums[right-1]){
            return nums[right];
        }

        while(left <= right){
            int mid = right - (right-left)/2;
            //Unique Element Condition
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(((mid%2)==0 && nums[mid]==nums[mid+1]) 
            || ((mid%2)==1 && nums[mid]==nums[mid-1])){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            
        }
        return -1;
    }
}