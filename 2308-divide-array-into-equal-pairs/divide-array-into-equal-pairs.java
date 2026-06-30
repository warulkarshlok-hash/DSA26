class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int key : nums){
            map.put(key,map.getOrDefault(key,0)+1);

        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()%2!=0){
                return false;
            }
        }
        // for (int freq : map.values()) {
        // if (freq % 2 != 0) {
        // return false;
        // }
        // }
        return true;
    }
}