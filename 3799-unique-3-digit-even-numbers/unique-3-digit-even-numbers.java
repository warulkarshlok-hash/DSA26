class Solution {
    public int totalNumbers(int[] digits) {
       int count = 0; 
       int[] freq = new int[10];
       for(int digit : digits){
        freq[digit]++;
       } 

       for(int num = 100;num<=998;num=num+2){
        int n = num;
        int a = n%10;
        n/=10;
        int b =n%10;
        n/=10;
        int c = n%10;

        int[] need = new int[10];
        need[a]++;
        need[b]++;
        need[c]++;

        boolean possible = true;
        for(int d = 0;d<=9;d++){
            if(need[d]>freq[d]){
                possible = false;
                break;
            }
        }

        if(possible) count++;
       }

       return count;
    }
}