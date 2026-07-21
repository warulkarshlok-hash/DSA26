class Solution {
    public String reversePrefix(String word, char ch) {
     HashSet<Character> set = new HashSet<>();

    // for(char c : word.toCharArray()){
    //     set.add(c);
    // }
    // if(!set.contains(ch)){
    //     return word;
    // }
    
    // int k = 0;
    // for(char cha : word.toCharArray()){
    //     if(cha != ch){
    //         k++;
    //     }
    // }

    if(word.indexOf(ch)==-1){
        return word;
    }

    char[] arr = word.toCharArray();
    int right = word.indexOf(ch);
    int left = 0;

    while(left < right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }

    return new String(arr);

    }
}