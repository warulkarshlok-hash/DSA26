// class Solution {
//     public int[] sortedSquares(int[] nums) {
//        int i = 0;
//        int k = 0;
//        int[] res = new int[nums.length];
//        while(i<nums.length){
//         res[k] = nums[i]*nums[i];
//         i=i+1;
//         k=k+1;
//        }
//        Arrays.sort(res);
//        return res;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;        
    }
}