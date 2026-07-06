class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // TWO POINTER APPROACH : 5ms ,150MB
        // int n = nums.length;
        // int[] arr = new int[n];
        // int left = 0;
        // int right = n-1;
        // int start = 0;
        // int end = n-1;
        // while(left < n && right>=0){
        //     if(nums[left]<pivot){
        //         arr[start]=nums[left];
        //         start++;
        //     }
        //     left++;
        //     if(nums[right]>pivot){
        //         arr[end]=nums[right];
        //         end--;
        //     }
        //     right--;
        // }
        // while (start <= end) {
        //     arr[start] = pivot;
        //     start++;
        // }
        // return arr;

        //3 FOR LOOP APPROACH : 
        int[] ans = new int[nums.length];
        int index = 0;

        // Elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                ans[index++] = num;
            }
        }

        // Elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                ans[index++] = num;
            }
        }

        // Elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}