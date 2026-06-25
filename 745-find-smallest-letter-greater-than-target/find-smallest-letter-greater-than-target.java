// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         HashSet<Character> set = new HashSet<>();
//         int num = 0;
//         char ch = 'a';
//         char ans = letters[0];
//         for(char c : letters){
//             set.add(c);
//         }

//         for(int i =1;i<26;i++){
//             num = target + i;
//             ch = (char) num;
//              if(set.contains(ch)){
//             ans = ch;
//             break;
//         }
//         }
       

//         return ans ;
//     }
// }

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

       if (left == letters.length) {
    return letters[0];
} else {
    return letters[left];
}
    }
}