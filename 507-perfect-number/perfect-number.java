class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sum = 1;
        //divisors comes in pairs; 
        // 1 * 28 
        //2*14 or 14*2 so we can calculate another number if we have one 

        for (int i = 2; i * i <= num; i++) { // _/28 = 5 , so just go till 5 , give will get other easily
                if (num % i == 0) {  // sum madhe 2 add hoil
                sum += i;

                if (i != num / i) { // sum madhe 14 add hoil 
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}