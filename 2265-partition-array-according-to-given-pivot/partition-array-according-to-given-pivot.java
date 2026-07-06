class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        
        int left = 0;
        int right = n-1;
        int start = 0;
        int end = n-1;
        while(left < n && right>=0){
            if(nums[left]<pivot){
                arr[start]=nums[left];
                start++;
            }
            left++;
            if(nums[right]>pivot){
                arr[end]=nums[right];
                end--;
            }
            right--;
        }
        while (start <= end) {
            arr[start] = pivot;
            start++;
        }
        return arr;
    }
}