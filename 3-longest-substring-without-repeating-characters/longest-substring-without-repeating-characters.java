class Solution {
    public int lengthOfLongestSubstring(String s) {
        //OPTIMIZED USING ONE WHILE LOOP: 
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right =0;
        int max = Integer.MIN_VALUE;
        while(right<s.length()){
            
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(left)); //fakt magcha element remove kraycha , insted of starting right from left again , makes it run it O(n)
                left++;
            }

        }
        return s.length()==0? 0:max; //EDGE CASE : 0 sathi 0 answer 

    }
}
            //BRUTE FORCE : 87MS
        // HashSet<Character> set = new HashSet<>();
        // int max = Integer.MIN_VALUE;
        // int i = 0;
        // while(i<s.length()){
        //     for(int j = i;j<s.length();j++){
        //         if(!set.contains(s.charAt(j))){
        //             set.add(s.charAt(j));
        //             max = Math.max(max,set.size());
        //         }
        //         else{
        //             i++;
        //             set.clear();
        //             break; // NAHITR J UPDATE(J=I) NA HOTA ,NEXT VALUE GHEIL ,I.E J++; 
        //         }
        //     }
        // }
        // return s.length()==0? 0:max;


