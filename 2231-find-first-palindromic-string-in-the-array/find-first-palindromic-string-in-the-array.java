class Solution {
    public boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String sh : words){
            if(isPalindrome(sh)){
                return sh;
            }
        }

        return "";
    }
}