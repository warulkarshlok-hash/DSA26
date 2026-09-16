class Solution {
    public int maxFreqSum(String s) {
       int sum = 0;
       int max_vowel = 0;
       int max_conso = 0;
       int[] freq = new int[26];
       for(char ch : s.toCharArray()){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            freq[ch-'a']++;
            max_vowel = Math.max(max_vowel,freq[ch-'a']);
        }
        else{
            freq[ch-'a']++;
            max_conso=Math.max(max_conso,freq[ch-'a']);
        }
       }
        return max_vowel + max_conso;
    }
}