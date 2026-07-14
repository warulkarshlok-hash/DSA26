class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        //removes everything(except small letters) like ,!.;AND space
        
        String[] words = paragraph.split("\\s+");
        // \\s+ : Split the string wherever there are one or more whitespace characters.

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String ban : banned) {
            map.remove(ban);
        }

        int max = 0;
        String ans = "";

        for (String word : words) {
            if (map.containsKey(word) && map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }

        return ans;
    }
}