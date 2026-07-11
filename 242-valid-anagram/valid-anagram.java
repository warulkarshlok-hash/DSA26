class Solution {
    public boolean isAnagram(String s, String t) {
        //brute force : 3ms , 93%
        // int[] freq = new int[26];
        // if(s.length() != t.length()){
        //     return false;
        // }

        // for(char c : s.toCharArray()){
        //     freq[c-'a']++;
        // }
        // for(char ch : t.toCharArray()){
        //     if(freq[ch-'a'] > 0){
        //         freq[ch-'a']--;
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;

        //Optimized approach : 0ms,100%
        int[] freq = new int[26];
        int n = s.length(),m=t.length();
        if(n!=m) return false;
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++)
            if (freq[i] != 0)
                return false;
        return true;
    }
}