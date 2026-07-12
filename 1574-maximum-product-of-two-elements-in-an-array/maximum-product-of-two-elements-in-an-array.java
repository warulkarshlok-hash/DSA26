class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int last = nums[n-1]-1;
        int secLast = nums[n-2]-1;
        int ans = last * secLast;
        return ans;
    }
}