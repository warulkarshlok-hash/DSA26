class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if(s.length() != t.length()){
            return false;
        }

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(char ch : t.toCharArray()){
            if(freq[ch-'a']>0){
                freq[ch-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}