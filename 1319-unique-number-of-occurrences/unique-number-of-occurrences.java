class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(!set.add(e.getValue())){
                return false;
            }
        }
        return true;
    }
}