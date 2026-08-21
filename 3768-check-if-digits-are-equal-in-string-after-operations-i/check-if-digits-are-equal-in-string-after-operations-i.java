class Solution {
    public boolean hasSameDigits(String s) {

        ArrayList<Character> list = new ArrayList<>();

        for(char ch : s.toCharArray()) {
            list.add(ch);
        }

        while(list.size() > 2) {

            ArrayList<Character> current = new ArrayList<>();

            for(int i = 0; i < list.size() - 1; i++) {

                int digit = ((list.get(i) - '0') + (list.get(i + 1) - '0')) % 10;

                current.add((char)(digit + '0'));
            }

            list = current;
        }

        return list.get(0) == list.get(1);
    }
}