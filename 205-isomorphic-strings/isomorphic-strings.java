class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        int i = 0;

        for (char ch : s.toCharArray()) {

            if (map.containsKey(ch)) {

                if (map.get(ch) != t.charAt(i)) {
                    return false;
                }

            } else { //s=ab and t=aa SATHI SPECIAL CONDITION AS No two characters may map to the same character 

                if (used.contains(t.charAt(i))) {
                    return false;
                }

                map.put(ch, t.charAt(i));
                used.add(t.charAt(i));
            }

            i++;
        }

        return true;
    }
}