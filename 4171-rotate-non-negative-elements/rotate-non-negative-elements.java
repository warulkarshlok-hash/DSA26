class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>=0){
                count++;
            }
        }
        if(count == 0){
         return nums;
         }
        int[] temp1 =new int[count]; //positve number array 
        int[] indexArr =new int[count]; // index of that positve number 

        int index = 0;
        for(int j= 0;j<n;j++){
            if(nums[j]>=0){
                temp1[index] = nums[j];
                indexArr[index] = j;
                index++;
            }
        }

        k=k%count; //not n , as we are rotating just non-negative integer array

        int[] temp2 = new int[k]; //elements to rotate 
        for(int a = 0;a<k;a++){
            temp2[a]=temp1[a];

        }
        for(int b=0;b<temp1.length-k;b++){
            temp1[b]=temp1[k+b];
        }
        int p = 0;
        for(int c = temp1.length-k;c<temp1.length;c++){
            temp1[c]=temp2[p];
            p++;
        }

        for(int m = 0;m<indexArr.length;m++){
            nums[indexArr[m]]=temp1[m];
        }
        return nums;


    }
}