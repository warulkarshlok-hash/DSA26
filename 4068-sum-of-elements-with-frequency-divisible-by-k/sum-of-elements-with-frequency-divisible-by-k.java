class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        int sum  = 0;
        for(int num : nums){
            freq[num]++;
        }

        for(int n : nums){
            if(freq[n]%k == 0){
                sum += n;
            }
        }

        return sum;
    }
}