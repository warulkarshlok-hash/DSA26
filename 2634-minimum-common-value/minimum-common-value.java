class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // TWO POINTER : TIME LIMIT EXCEEDS 
        // for(int i = 0 ; i < nums2.length ; i++){
        //     for(int j = 0 ; j < nums1.length ; j++){
        //         if(nums2[i]==nums1[j]){
        //             return nums2[i];
        //         }
        //     }
        // }
        // return -1;

        // HASHSET APPRAOACH : VERY LOW BEATS ONLY 19% 
        // HashSet<Integer> set  = new HashSet<>();
        // for(int num : nums1){
        //     set.add(num);
        // }
        // for(int num : nums2){
        //     if(set.contains(num)){
        //         return num;
        //     }
        // }
        // return -1;
        
        //OPTIMIZED APPROACH TWO POINTER + BINARY SEARCH 
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return -1; 
        
    }
}