class Solution {
    public int numberOfSpecialChars(String word) {
       int[] UpperCase = new int[26];
       int[] LowerCase = new int[26];
       int count = 0;  
       boolean found = false; 
       for(char ch : word.toCharArray()){

        if(Character.isLowerCase(ch)){
            LowerCase[ch-'a']++;
        }
        else{
            UpperCase[ch-'A']++;
            found = true;
        }
       }

       if(found==false) return 0;

       

       for(int i = 0;i<LowerCase.length;i++){
        if((LowerCase[i] != 0) && (UpperCase[i] != 0)){ 
                if((LowerCase[i]-UpperCase[i])>=0 || (UpperCase[i] - LowerCase[i])>=0){
                    count++; 
                }
        } 

       }
       return count ; 
    }
}