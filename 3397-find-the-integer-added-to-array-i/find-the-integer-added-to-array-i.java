// class Solution {
//     public int addedInteger(int[] nums1, int[] nums2) {
//        if(Arrays.equals(nums1,nums2)) return 0;

//        Arrays.sort(nums1);
//        Arrays.sort(nums2);

//        int ans = nums2[0]-nums1[0]; 
//        for(int i = 1;i<nums1.length;i++){
//             if((nums2[i]-nums1[i]) != ans){
//                 return 0;
//             }
//        }

//         return ans;
//     }
// } //5ms

//QUESTION NIT SMJUN GHYAYCHA N SHLOKKKKK
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=nums1[0],min2=nums2[0];

        int i=0;
        while(i<nums1.length){
            min1=Math.min(min1,nums1[i]);i++;
        }

        i=0;
        while(i<nums2.length){
            min2=Math.min(min2,nums2[i]);i++;
        }
        return min2-min1;
    }
}