class Solution {
    public boolean isBalanced(String num) {
        int even_sum = 0;
        int odd_sum = 0;
        char[] arr =  num.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            int digit = arr[i] - '0';
            if(i%2==0){
                even_sum+=digit;
            }
            else{
                odd_sum+=digit;
            }

            
        }
        return (even_sum==odd_sum);
    }
}