class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;
        int dups = 0;

        // First window
        for (int i = 0; i < k; i++) {
            int x = nums[i];
            map.put(x, map.getOrDefault(x, 0) + 1);

            if (map.get(x) == 2) {   // duplicate appears first time
                dups++;
            }

            sum += x;
        }

        if (dups == 0)
            max = sum;

        // Sliding window
        for (int j = k; j < nums.length; j++) {

            int add = nums[j];
            int remove = nums[j - k];

            // Add new element
            map.put(add, map.getOrDefault(add, 0) + 1);
            if (map.get(add) == 2) {
                dups++;
            }
            sum += add;

            // Remove old element
            if (map.get(remove) == 2) {
                dups--;
            }

            map.put(remove, map.get(remove) - 1);

            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            sum -= remove;

            // Check current window
            if (dups == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}