class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int k : nums){
            if(k%2==0 && map.get(k)==1){
                return k;
            }
        }

        return -1;
    }
}