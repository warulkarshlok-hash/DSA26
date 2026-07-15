class Solution {
    public void duplicateZeros(int[] arr) {

   
        int[] k=arr.clone();
        int i=0,l=0;
        while(l<arr.length)
        {
            if(k[i]==0)
            {
                arr[l++]=0;
                if(l<arr.length)
                {
                    arr[l++]=0;
                }
            }
                else
                {
                    arr[l++]=k[i];
                }
                i++;
            
        }
    

    //   int[] nums = new int[arr.length];

    //   int  i = 0;
    //   int j = 0;
    //   while(i<arr.length && j<nums.length){
    //     if(arr[i] != 0){
    //         nums[j] = arr[i];
           
    //         j++;
    //     }
    //     else{
    //         nums[j]=0;
    //         if(j+1<nums.length){
    //         nums[j+1]=0;
            
    //         }
    //         j=j+2;
    //     }
    //     i++;
        
       
    //   }

    //   for(int p = 0;p<arr.length;p++){
    //     arr[p]=nums[p];
      }
    }
