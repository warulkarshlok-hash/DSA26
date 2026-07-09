class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) return ans;

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Store frequency of pattern and first window
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pFreq, windowFreq)) {
            ans.add(0);
        }

        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {

            // Remove left character
            windowFreq[s.charAt(i - p.length()) - 'a']--;

            // Add new right character
            windowFreq[s.charAt(i) - 'a']++;

            // Compare frequencies
            if (Arrays.equals(pFreq, windowFreq)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }
}