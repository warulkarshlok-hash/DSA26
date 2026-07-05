class Solution {
public:
    bool canThreePartsEqualSum(vector<int>& arr) {
        int total = 0;

        for (auto it : arr) {
            total += it;
        }

        if (total % 3 != 0)
            return false;

        int sum = 0;
        int count = 0;
        int result = total / 3;

        for (auto it : arr) {
            sum += it;

            if (sum == result) {
                count++;
                sum = 0;
            }
        }

        return count >= 3;
    }
};