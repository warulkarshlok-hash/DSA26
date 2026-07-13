class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> ans = new ArrayList<>();
        String digits = "123456789";

        int minLen = String.valueOf(low).length();
        int maxLen = String.valueOf(high).length();

        // Variable window size
        for (int window = minLen; window <= maxLen; window++) {

            int left = 0;
            int right = window;

            while (right <= digits.length()) {

                int num = Integer.parseInt(digits.substring(left, right));

                if (num >= low && num <= high)
                    ans.add(num);

                left++;
                right++;
            }
        }

        return ans;
    }
}