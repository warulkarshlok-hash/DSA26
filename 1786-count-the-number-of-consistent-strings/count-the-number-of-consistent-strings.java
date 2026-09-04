class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr=new boolean[26];
        for(char c:allowed.toCharArray()){
            arr[c-'a']=true;
        }
        int count=0;
        for(String st:words){
            boolean ans=true;
            for(char ch:st.toCharArray()){
                if(arr[ch-'a']==false){
                    ans=false;
                    break;
                }
            }
            if(ans){
                count++;
            }
        }
        return count;
            
    }
}