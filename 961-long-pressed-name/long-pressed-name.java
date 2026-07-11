class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (j < typed.length()) {

            // 1. Characters match
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }

            // 2. Long press (same as previous typed character)
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }

            // 3. Invalid character
            else {
                return false;
            }
        }

        // All characters of name must be matched
        return i == name.length();
    }
}