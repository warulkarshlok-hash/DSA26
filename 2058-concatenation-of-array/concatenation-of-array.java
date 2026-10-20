class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result  = new int[nums.length + nums.length];
        int n = nums.length;
        for(int i = 0 ;i<nums.length;i++){
            result[i]=nums[i];
            result[n+i]=nums[i];
        }

        return result;
    }
}