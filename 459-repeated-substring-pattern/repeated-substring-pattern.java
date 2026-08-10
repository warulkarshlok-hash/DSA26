class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;

        return doubled.substring(1, doubled.length() - 1).contains(s);
        //removed first and last char so we could find wherter it exist or not 
    }
}