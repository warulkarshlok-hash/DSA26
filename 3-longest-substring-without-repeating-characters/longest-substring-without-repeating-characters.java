class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i<s.length()){
            for(int j = i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    max = Math.max(max,set.size());
                }
                else{
                    i++;
                    set.clear();
                    break; // NAHITR J UPDATE(J=I) NA HOTA ,NEXT VALUE GHEIL ,I.E J++; 
                }
            }
        }
        return s.length()==0? 0:max;
    }
}