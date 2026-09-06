class Solution {
    public String sortSentence(String s) {

        String[] words = s.split("\\s+");
        String result = "";
        String[] ans = new String[200];

        int max = 0;
        int min = 10;

        for (int i = words.length - 1; i >= 0; i--) {

            int digit = (words[i].charAt(words[i].length() - 1)) - '0';

            max = Math.max(max, digit);
            min = Math.min(min, digit);

            ans[digit - 1] = words[i].substring(0, words[i].length() - 1); //to remove the last digit
        }

        for (int j = min - 1; j < max; j++) {
            result += ans[j] + " "; //to add space between words 
        }

        return result.trim();
    }
}