class Solution {
    public int getLucky(String s, int k) {

        int sum = 0;

        // First transformation and addition of digits 
        for(char c : s.toCharArray()) {
            int val = c - 'a' + 1;

            while(val > 0) {
                sum += val % 10;
                val /= 10;
            }
        }

        k--; //as k will dicrease after above step 

        // Remaining transformations
        while(k > 0) {
            int newSum = 0;

            while(sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }

            sum = newSum;
            k--;
        }

        return sum;
    }
}