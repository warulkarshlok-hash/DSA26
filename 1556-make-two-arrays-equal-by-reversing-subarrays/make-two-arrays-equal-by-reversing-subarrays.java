class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : target){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : arr){
            if(map.containsKey(key) && map.get(key)>0){
                map.put(key, map.get(key) - 1);
                
            }
            else{
                return false;
            }
           
        }
        return true;
    }
}