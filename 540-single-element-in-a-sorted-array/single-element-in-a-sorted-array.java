class Solution {
    public int singleNonDuplicate(int[] nums) {
        // //BEST OPTIMAL SOLUTION BEATS 100% , WATCH VIDEO OF TECHDOES 
        // int n = nums.length;
        // int left  = 0;
        // int right = n-1;
        // //Boundry Condition : 
        // if(right==0) return nums[0];
        // else if(nums[0] != nums[1]){
        //     return nums[0];
        // }
        // else if(nums[right] != nums[right-1]){
        //     return nums[right];
        // }

        // while(left <= right){
        //     int mid = right - (right-left)/2;
        //     //Unique Element Condition
        //     if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
        //         return nums[mid];
        //     }
        //     //always remember same element start at even index and end at odd index,so unique will lie in right side 
        //     //ELSE , in left side .
        //     if(((mid%2)==0 && nums[mid]==nums[mid+1]) //EVEN 
        //     || ((mid%2)==1 && nums[mid]==nums[mid-1])){ //ODD
        //         left = mid + 1;
        //     }
        //     else{
        //         right = mid - 1;
        //     }
            
        // }
        // return -1;


        //Ex-or vala Logic 
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans;
    }
}