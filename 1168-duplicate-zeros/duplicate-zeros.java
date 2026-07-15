class Solution {
    public void duplicateZeros(int[] arr) {
      int[] nums = new int[arr.length];

      int  i = 0;
      int j = 0;
      while(i<arr.length && j<nums.length){
        if(arr[i] != 0){
            nums[j] = arr[i];
           
            j++;
        }
        else{
            nums[j]=0;
            if(j+1<nums.length){
            nums[j+1]=0;
            
            }
            j=j+2;
        }
        i++;
        
       
      }

      for(int p = 0;p<arr.length;p++){
        arr[p]=nums[p];
      }
    }
}