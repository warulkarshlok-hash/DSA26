class Solution {
    public int maxProductDifference(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // long product1 = nums[0]*nums[1];
        // long product2 = nums[n-1]*nums[n-2];

        // long ans = product2 - product1;

        // return (int) ans ;
        long ans = 0;
        int n = nums.length;
        int min1 =Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = 0, max2 = 0;
        for(int i = 0 ;i < n;i++){
            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<min2){
                min2=nums[i];
            }
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }
            long product1 = min1 * min2;
            long product2 = max1 * max2;

             ans = product2 - product1;

                      
        }
        return (int) ans ;  
    }
}