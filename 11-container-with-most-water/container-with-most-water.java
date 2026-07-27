class Solution {
    public int maxArea(int[] height) {
        
        int left = 0 ;
        int right = height.length - 1 ;
        int max = 0 ;

        while(left < right){

            int width = right - left ;
            int heigh = Math.min(height[left],height[right]);

            int area = width * heigh ;
            max = Math.max(max,area);

            if(height[left] < height[right]){
                left++;
            } else {
                right --;
            }
        }
        return max ;



        // int MaxArea = 0;
        // int left = 0;
        // int right = height.length-1;
        // int minHeight = 0;
        // int length = 0;
        // int currArea = 0;
        
        // while(left < right){
            
        //     if(height[left] == height[right]){
        //         minHeight = height[left];
               
        //     }
        //     else{
        //         minHeight = Math.min(height[left],height[right]);
        //     }

        //     length = right-left;
        //     currArea = minHeight * length;
        //     MaxArea = Math.max(MaxArea,currArea);

        //     if(height[left]<height[right]){
        //         left++;
        //     }
        //     else if(height[left]>=height[right]){
        //         right--;
        //     }
            
        // }

        // return MaxArea;
    }
}