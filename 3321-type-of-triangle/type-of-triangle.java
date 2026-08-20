class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // Triangle validity
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // Equilateral
        if (a == b && b == c) {
            return "equilateral";
        }

        // Isosceles
        if (a == b || b == c || a == c) {
            return "isosceles";
        }

        // Scalene
        return "scalene";
    }
}