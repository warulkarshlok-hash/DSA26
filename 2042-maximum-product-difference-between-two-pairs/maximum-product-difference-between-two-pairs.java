class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long product1 = nums[0]*nums[1];
        long product2 = nums[n-1]*nums[n-2];

        long ans = product2 - product1;

        return (int) ans ;
    }
}