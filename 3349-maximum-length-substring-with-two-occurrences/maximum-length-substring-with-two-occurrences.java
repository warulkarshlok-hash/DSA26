class Solution {
    public int maximumLengthSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int n =s.length();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        int start = 0;
        int end = 0;
        while(end<s.length()){
            char key = s.charAt(end); 
            map.put(key,map.getOrDefault(key,0)+1);
        
            while(map.get(key)>2){
                char i = s.charAt(start);
                map.put(i,map.get(i)-1);
                start++;
            } 
            end++;
            
                max=Math.max(max,end-start);
            
            
            }

        return max;
    }
}