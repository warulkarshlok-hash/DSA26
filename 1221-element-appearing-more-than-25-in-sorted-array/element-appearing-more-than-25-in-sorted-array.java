class Solution {
    public int findSpecialInteger(int[] arr) {
        int limit = arr.length/4;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>limit){
                return e.getKey();
            }
        }
        return -1;
    }
}