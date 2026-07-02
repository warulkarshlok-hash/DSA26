class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //OPTIMIZED 
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        for(int i = k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return (double) maxSum/k;


        //BRUTE FORCE
    //  int i = 0;
    //  int p = 0;
    //  //double is important thing here 
    //  double sum = 0;
    //  double max = Integer.MIN_VALUE;
    //  double avg = 0;
    //  for(int j = 0;j<k;j++){
    //     sum+=nums[j];
    //     p=j+1;
    //  }
        // avg = sum/k;
        // max=Math.max(max,avg);

        // while(p<nums.length){
        //     sum+=nums[p];
        //     sum-=nums[i];
        //     avg = sum/k; // To get accurate result atleast one should be double 
        //     max=Math.max(max,avg);

        //     p++;
        //     i++;
            
        // }
        // return max;
    
    }

}