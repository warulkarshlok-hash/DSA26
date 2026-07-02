class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int i = 0;
     int p = 0;
     double sum = 0;
     double max = Integer.MIN_VALUE;
     double avg = 0;
     for(int j = 0;j<k;j++){
        sum+=nums[j];
        p=j+1;
     }
        avg = sum/k;
        max=Math.max(max,avg);

        while(p<nums.length){
            sum+=nums[p];
            sum-=nums[i];
            avg = sum/k;
            max=Math.max(max,avg);

            p++;
            i++;
            
        }
        return max;
    }
}