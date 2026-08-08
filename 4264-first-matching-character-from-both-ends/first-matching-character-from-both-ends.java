class Solution {
    public int firstMatchingIndex(String s) {

        int left = 0;
        int right = s.length()-1;
        while(left<=right){
        
        if(s.charAt(left)==s.charAt(right)){
            return left;
        }    
            left++;
            right = s.length()-left-1;
        }
        return -1;

    //     int n = s.length();
    //    for(int i =  0;i<=n/2;i++){
    //     if(s.charAt(i)==s.charAt(n-i-1)){
    //         return i;
    //     }
    //    }
    //    return -1;
    }
}