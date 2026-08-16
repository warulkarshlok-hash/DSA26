class Solution {
    public long removeZeros(long n){

    long res = 0;
    long mul = 1;
    while(n > 0){
        int d = (int) (n % 10);
        if(d != 0) {
            res = res  + d * mul;
            mul *= 10;
        }
        n /= 10;
    }

    return res;
 


    //   8ms , 6%  
    //   String s = "";
    //   while(n>0){
    //     s=(char)('0'+n%10)+s;
    //     n=n/10;
    //   }

    //   String ans ="";
    //   for(char ch : s.toCharArray()){
    //     if(ch !='0'){
    //         ans+=ch;
    //     }
    //   }
    // //   System.out.println(ans);
    //   return Long.parseLong(ans);
    }
}