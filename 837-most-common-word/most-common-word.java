class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");

        HashSet<String> bannedSet = new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word);
        }

        HashMap<String, Integer> freq = new HashMap<>();

        int maxFreq = 0;
        String ans = "";

        for (String word : words) {

            if (bannedSet.contains(word))
                continue;

            int count = freq.getOrDefault(word, 0) + 1;
            freq.put(word, count);

            if (count > maxFreq) {
                maxFreq = count;
                ans = word;
            }
        }

        return ans;


        //19ms ,21%
        // paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        // //removes everything(except small letters) like ,!.; AND space

        // String[] words = paragraph.split("\\s+");
        // // \\s+ : Split the string wherever there are one or more whitespace characters.

        // HashMap<String, Integer> map = new HashMap<>();

        // for (String word : words) {
        //     map.put(word, map.getOrDefault(word, 0) + 1);
        // }

        // for (String ban : banned) {
        //     map.remove(ban);
        // }

        // int max = 0;
        // String ans = "";

        // for (String word : words) {
        //     if (map.containsKey(word) && map.get(word) > max) {
        //         max = map.get(word);
        //         ans = word;
        //     }
        // }

        // return ans;
    }
}