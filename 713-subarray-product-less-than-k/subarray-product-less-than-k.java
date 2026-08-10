class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0 ;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<k) count++;
            int j = i+1;
            int prod = nums[i];
            while(prod < k){
                if(j<nums.length){
                    prod  *= nums[j];
                    j++;
                    
                    if(prod < k){
                        count++;
                    }    
                    else{
                        
                        continue;
                    }
                }
                else{
                    break;
                }

                
            }
        }
        return count;
    }
}