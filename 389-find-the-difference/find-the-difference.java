

class Solution {
    public char findTheDifference(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while(i < a.length) {
            if(a[i] != b[j]) {
               return b[j]; //if any character in middle is repeated it will directly return that saying its added 
            }
            i++;
            j++;
        }

        return b[b.length - 1];
    }
}
