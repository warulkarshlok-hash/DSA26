class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0;
        for(int i = 0;i<nums1.length;i++){
            if(nums1[i]%2==1){
                odd=nums1[i];
                break;
            }
        }
        if(odd==0) return true;

        int[] nums2=new int[nums1.length];
        
        for(int j=0;j<nums1.length;j++){
            if(nums1[j]%2==0){
                nums2[j]=nums1[j]-odd;
            }
            else{
                nums2[j]=nums1[j];
            }
        }

        // System.out.println(Arrays.toString(nums2));
        return true;

    }
}

// It is always possible to make the array all odd with at least 1 odd number since even - odd = odd, if there are no odds the array is already all even so it is always possible, the answer is just return true