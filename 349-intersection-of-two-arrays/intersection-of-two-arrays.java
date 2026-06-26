class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set  = new HashSet<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j : nums2){
            if(map.containsKey(j)){
                list.add(j);
            }
        }
         int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        for(int k = 0 ;k<arr.length;k++){
            set.add(arr[k]);
        }
        int[] ans = set.stream()
               .mapToInt(Integer::intValue)
               .toArray();
        return ans;
    }
}