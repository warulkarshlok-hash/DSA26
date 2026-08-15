class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int oddMax = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i]>oddMax && freq[i]%2 != 0){
                oddMax=freq[i];
            }
        }
        // System.out.println(oddMax);
        int evenMin = Integer.MAX_VALUE;
        for(int j = 0;j<freq.length;j++){
            if(freq[j] > 0 && freq[j] % 2 == 0 && freq[j] < evenMin){
                evenMin = freq[j];
            }
        }
        // System.out.println(evenMin);

        return oddMax-evenMin;
    }
}