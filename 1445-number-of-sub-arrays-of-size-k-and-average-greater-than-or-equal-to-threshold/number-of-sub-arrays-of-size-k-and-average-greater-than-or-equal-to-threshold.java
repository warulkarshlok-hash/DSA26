class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0 ;
        int sum = 0;
        double avg =0;
        int left = 0;
        int right = k;
        for(int i = 0;i<k;i++){
            sum+=arr[i];
            
        }
        avg = sum/k;
        if(avg>=threshold){
            count++;
        }
        while(right<arr.length){
            sum+=arr[right];
            sum-=arr[left];

            avg=sum/k;
            if(avg>=threshold){
            count++;
            }
            right++;
            left++;

        }
        return count;
    }
}