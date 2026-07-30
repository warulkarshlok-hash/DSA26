class Solution {
    public boolean canConstruct(String ransomNote, String magazine){


        //using FREQ ARRAY : 
        if(ransomNote.length() > magazine.length()){
            return false;
        }    

        int[] freq = new int[26];

        for(char c : magazine.toCharArray()){
            freq[c - 'a']++;
        }    
        
        for(char c : ransomNote.toCharArray()){
            if(freq[c - 'a'] == 0){
                return false;
            }
            freq[c - 'a']--;    
        }
        return true;
        
   

        //Using HASHMAP : 15ms & 30%
        // HashMap<Character,Integer> map = new HashMap<>();

        // for(char c : magazine.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);

        // }

        // for(char key : ransomNote.toCharArray()){
        //     if(!map.containsKey(key)){
        //         return false;
        //     }
        //     else if(map.containsKey(key) && map.get(key) != 0){
        //         map.put(key,map.get(key)-1);

        //     }
        //     else{
        //         return false;
        //     }
        // }

        // return true;
    }
}