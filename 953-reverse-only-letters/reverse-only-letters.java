class Solution {
    public String reverseOnlyLetters(String s) {
    int left = 0;
    int right = s.length()-1;
    char[] ch = s.toCharArray();

        while(left<right){
            if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
                char temp = ch[right];
                ch[right] = ch[left];
                ch[left]=temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(ch[left])){
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                right--;
            }

        }

        String ans  = new String(ch);
        return ans;
    }
}