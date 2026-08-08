class Solution {
    public int lengthAfterTransformations(String s, int t) {

        long[] freq = new long[26];
        long MOD = 1000000007;

        // Count characters
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Transform
        for (int i = 0; i < t; i++) {

            long z = freq[25];

            // Shift a -> b, b -> c, ..., y -> z
            for (int j = 25; j > 0; j--) {
                freq[j] = freq[j - 1];
            }

            // z -> ab
            freq[0] = z;
            freq[1] = (freq[1] + z) % MOD;
        }

        // Calculate final length
        long ans = 0;

        for (long count : freq) {
            ans = (ans + count) % MOD;
        }

        return (int) ans;
    }
}