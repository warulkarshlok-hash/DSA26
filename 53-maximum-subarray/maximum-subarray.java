class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;   

        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
            
        }   

        return max ;


        //TIME LIMIT EXCEED
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i =  0;i<n;i++){
        //     for(int j = i;j<n;j++){
        //         sum += nums[j];
        //         max = Math.max(max,sum);
        //         if(j==n-1){
        //             sum=0;
        //             break;
                    
        //         }
        //     }
        // }
        // return max;
    }
}