class Solution {
    public int SumOfSquareOfDigits(int num){
        int sum =  0;

        while(num>0){
            int digit = num%10;
            sum+=digit*digit;
            num=num/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast >=1){
            slow =SumOfSquareOfDigits(slow);
            fast = SumOfSquareOfDigits(SumOfSquareOfDigits(fast));
            if(fast==1){
                return true;
            }

            if(fast==slow){
                return false;
            }
        }
        return true;
    }
}