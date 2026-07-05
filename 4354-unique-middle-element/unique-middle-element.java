class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        // int n = nums.length;
        // int middle = n/2;
        // int midElement = nums[middle];
        // int[] freq = new int[101];

        // for(int num : nums){
        //     freq[num]++;
        // } 

        // if(freq[midElement]!=1){
        //     return false;
        // }
        
        // return true;

        // in just one for loop 
        int midElement = nums[nums.length/2];
        int count= 0;
        for(int num : nums){
            if(num == midElement){
                count++;
            }
        }

        return count==1? true : false;
    }
}