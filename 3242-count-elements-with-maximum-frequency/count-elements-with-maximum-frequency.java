class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        
        int count = 0;
        for(int n : nums){
            freq[n]++;
        }

        int max = Integer.MIN_VALUE;
        for(int num : freq){
            if(num>max){
                max=num;
            }
        }

        for(int i =0;i<freq.length;i++){
            if(freq[i]==max){
                count++;
            }
        }

        return count*max;
    }
}