class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int middle = n/2;
        int midElement = nums[middle];
        int[] freq = new int[101];

        for(int num : nums){
            freq[num]++;
        } 

        if(freq[midElement]!=1){
            return false;
        }
        
        return true;
    }
}