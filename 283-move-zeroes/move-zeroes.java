// class Solution {
//     public void moveZeroes(int[] nums) {
//         int k = 0;
//         for(int i = 0;i<nums.length;i++){

//             if(nums[i] != 0){
//                 nums[k++]= nums[i];
//             }

//         }
//         for(int j = k;j<nums.length;j++){
//             nums[j]=0;
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int left  = 0;
        for(int right  = 0;right < nums.length;right++){
            if(nums[right] != 0 ){
                int temp  = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }
        } 

    }
}
