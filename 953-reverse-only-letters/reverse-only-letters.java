class Solution {
    public String reverseOnlyLetters(String s) {
    // int left = 0;
    // int right = s.length()-1;
    // char[] ch = s.toCharArray();

    //     while(left<right){
    //         if(Character.isLetter(ch[left]) && Character.isLetter(ch[right])){
    //             char temp = ch[right];
    //             ch[right] = ch[left];
    //             ch[left]=temp;
    //             left++;
    //             right--;
    //         }
    //         else if(!Character.isLetter(ch[left])){
    //             left++;
    //         }
    //         else if(!Character.isLetter(ch[right])){
    //             right--;
    //         }

    //     }

         
    //     return new String(ch);

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (!Character.isLetter(arr[i])) {
                i++;
            }
            else if (!Character.isLetter(arr[j])) {
                j--;
            }
            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }
}