class Solution {
    public int strStr(String haystack, String needle) {
        //BUILT IN 1
        // if(haystack.contains(needle)){
        //     return haystack.indexOf(needle);
        // }
        // else{
        //     return -1;
        // }

        //BUILT IN 2
        // return haystack.indexOf(needle);

        // OPTIMIZED USING SUBSTRING METHOD
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}