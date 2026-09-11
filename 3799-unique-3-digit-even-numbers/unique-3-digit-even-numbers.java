class Solution {
    public int totalNumbers(int[] digits) {
       int count = 0; 
       int[] freq = new int[10];
       for(int digit : digits){
        freq[digit]++;
       } 

       int EvenMax = 0;

       int max1 = Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
       int max3=Integer.MIN_VALUE;

       for(int i = 0;i<digits.length;i++){
        if(digits[i]>max1){
            max3=max2;
            max2=max1;
            max1=digits[i];
        }
        else if(digits[i]>max2){
            max3=max2;
            max2=digits[i];
        }
        else if(digits[i]>max3){
            max3=digits[i];
        }
       }
       EvenMax=(max1*100)+(max2*10)+max3;

       for(int num = 100;num<=EvenMax;num=num+2){
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