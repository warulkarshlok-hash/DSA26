class Solution {
    public int firstStableIndex(int[] nums, int p) {
        int k = 0;
        int ans = -1;
        while(k<nums.length){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int smallest = Integer.MAX_VALUE;

            for(int i = 0;i<=k;i++){
                max = Math.max(max,nums[i]);
            }

            for(int j = k;j<=nums.length-1;j++){
                min = Math.min(min,nums[j]);
            }

            smallest = Math.min(smallest,max-min);
                if(smallest <= p){
                    ans = k;
                    break;
                }
            k++;

            
        }
        return ans;
    }
}