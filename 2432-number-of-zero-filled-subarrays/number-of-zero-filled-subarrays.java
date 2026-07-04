class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
                count += n;   // <-- only change needed
            } else {
                n = 0;
            }
        }

        return count;
    }
}