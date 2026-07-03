class Solution {
    public int majorityElement(int[] nums) {
        
        //Moore Voting(NullyFying) Algorithm: 
        int majority = nums[0];
        int count = 1;

        for(int i =  1;i<nums.length;i++){
            if(count==0){
                majority = nums[i];
                count = 1;
            }
            else if(majority==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;


        //BRUTE FORCE USING HASHMAP : 13ms
    //    HashMap<Integer,Integer> map = new HashMap<>();
    //    int ans = 0 ;

    //    for(int num : nums){
    //     map.put(num,map.getOrDefault(num,0)+1);
    //    }

    //    int limit = nums.length/2;

    //    for(int key : map.keySet()){
    //     if(map.get(key)>limit){
    //         ans = key;
    //     }
    //    }
    //    return ans ;
  }
}