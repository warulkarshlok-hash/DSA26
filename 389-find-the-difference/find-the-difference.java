class Solution {
    public char findTheDifference(String s, String t) {

        char ans = 0;
         //^ is BITWISE XOR
        for(char ch : s.toCharArray()){
            ans ^= ch; // 'abcd'
        }

        for(char ch : t.toCharArray()){
            ans ^= ch; //for a : bcd
                       //for b : cd 
        }              //for c : d
                       //for d : 0
                       //for e : e  
       

        return ans;
    }
}