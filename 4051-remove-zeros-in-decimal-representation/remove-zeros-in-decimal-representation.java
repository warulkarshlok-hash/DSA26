class Solution {
    public long removeZeros(long n){
      String s = "";
      while(n>0){
        s=(char)('0'+n%10)+s;
        n=n/10;
      }

      String ans ="";
      for(char ch : s.toCharArray()){
        if(ch !='0'){
            ans+=ch;
        }
      }
    //   System.out.println(ans);
      return Long.parseLong(ans);
    }
}