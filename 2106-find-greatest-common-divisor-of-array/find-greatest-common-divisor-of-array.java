class Solution {
    public int findGCD(int[] nums) {
        int ans = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        for(int digit : nums){
            if(digit < min){
                min = digit;
            }
        }

        for( int i = 1;i <= max ;i++){
            if(max % i ==0 && min % i == 0){
                ans = i;
            }
        }
        
        
        return ans; 
    }
}