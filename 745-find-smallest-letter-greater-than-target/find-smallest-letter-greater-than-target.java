class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        HashSet<Character> set = new HashSet<>();
        int num = 0;
        char ch = 'a';
        char ans = letters[0];
        for(char c : letters){
            set.add(c);
        }

        for(int i =1;i<26;i++){
            num = target + i;
            ch = (char) num;
             if(set.contains(ch)){
            ans = ch;
            break;
        }
        }
       

        return ans ;
    }
}