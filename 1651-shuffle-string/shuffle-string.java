class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] ans = new char[n];

        int i = 0;
        for (char ch : s.toCharArray()) {
            ans[indices[i]] = ch;
            i++;
        }

        return new String(ans);
    }
}