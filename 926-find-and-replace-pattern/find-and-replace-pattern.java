class Solution {
    public boolean isIsoMorps(String a,String b){
        int[] map1 = new int[200];
        int[] map2 = new int[200];

        if(a.length() != b.length()) return false;

        for(int i = 0;i<a.length();i++){
            if(map1[a.charAt(i)] != map2[b.charAt(i)]){
                return false;
            }

            map1[a.charAt(i)]=i+1;
            map2[b.charAt(i)]=i+1;
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> ans = new ArrayList<>();

        for(int j = 0;j<words.length;j++){
            if(isIsoMorps(words[j],pattern)){
                ans.add(words[j]);
            }
        }
        return ans;
    }
}