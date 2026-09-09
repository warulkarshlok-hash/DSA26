class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       if(Arrays.equals(nums1,nums2)) return 0;

       Arrays.sort(nums1);
       Arrays.sort(nums2);

       int ans = nums2[0]-nums1[0]; 
       for(int i = 1;i<nums1.length;i++){
            if((nums2[i]-nums1[i]) != ans){
                return 0;
            }
       }

        return ans;
    }
}