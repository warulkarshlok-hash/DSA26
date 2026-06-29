class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char ch : sentence.toCharArray()){
            set.add(ch);
        }
        for(char c : alphabet.toCharArray()){
            if(!set.contains(c)){
                return false;
            }
        }
        return true;
    }
}