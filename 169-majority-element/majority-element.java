class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int ans = 0 ;

       for(int num : nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }

       int limit = nums.length/2;

       for(int key : map.keySet()){
        if(map.get(key)>limit){
            ans = key;
        }
       }
       return ans ;
  }
}