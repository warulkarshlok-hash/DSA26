class Solution {
    public boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        for(char key : ransomNote.toCharArray()){
            if(!map.containsKey(key)){
                return false;
            }
            else if(map.containsKey(key) && map.get(key) != 0){
                map.put(key,map.get(key)-1);

            }
            else{
                return false;
            }
        }

        return true;
    }
}