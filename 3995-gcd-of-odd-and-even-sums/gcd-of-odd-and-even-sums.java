class Solution {
    public int gcdOfOddEvenSums(int n) {
        long sumOdd = n*n;
        long sumEven = n*(n+1);

        long max = Math.max(sumOdd,sumEven);

        long min = Math.min(sumOdd,sumEven);

        return (int)max-(int)min;


    }
}