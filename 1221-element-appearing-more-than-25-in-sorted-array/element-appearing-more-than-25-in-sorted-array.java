class Solution {
    public int findSpecialInteger(int[] arr) {
        int limit = arr.length/4;
        int count = 0;
        if(arr.length==1) return arr[0];
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                if(count>=limit){
                    return arr[i];
                }
            }
            else{
                count=0;
            }
        }
        return -1;
    }
}