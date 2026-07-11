class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : nums2){
            if(map.containsKey(key) && map.get(key) !=0){
                list.add(key);
                map.replace(key,map.get(key)-1);

            }
        }
        int[] ans = new int[list.size()];

        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;

    }
}