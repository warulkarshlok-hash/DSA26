class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = flowerbed.length;
        if(n==0) return true;
        if(k==1 && flowerbed[0] ==0){
            n=n-1;
        }
        if(k>1){
        for(int i = 0;i<k;i++){
            if(flowerbed[i] != 1){
                if(i==0 && flowerbed[i+1] != 1){
                    flowerbed[i]=1;
                    n=n-1;
                    if(n==0) break;
                }
                if(i>0 && i+1 < k){
                    if(flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
                        flowerbed[i]=1;
                        n=n-1;
                        if(n==0) break;
                    }
                }
                if(i==k-1 && flowerbed[i-1] != 1){
                    flowerbed[i]=1;
                    n=n-1;
                    if(n==0) break;
                }
            }
        }
        }

        return n==0 ? true:false;
    }
}