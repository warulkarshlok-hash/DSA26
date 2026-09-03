class Solution {
    public int firstUniqueEven(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int n : nums){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }

        // for(int k : nums){
        //     if(k%2==0 && map.get(k)==1){
        //         return k;
        //     }
        // }

        // return -1;

     
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int c=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        c++;
                    }
                }
                if(c==1){
                    return nums[i];
                }
            }
                
        }
        return -1;
    
    }
}