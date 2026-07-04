class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int count=0;
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index = i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=max){
                if(max >= 2*nums[j]){
                    count++;
                }
                else{
                    return -1;
                }

            }
        }
        return count==nums.length-1 ? index : -1;
    }
}