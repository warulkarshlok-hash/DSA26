class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //Using Hashmap : 3ms,95%
        // ArrayList<Integer> list = new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : nums1){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int key : nums2){
        //     if(map.containsKey(key) && map.get(key) !=0){
        //         list.add(key);
        //         map.replace(key,map.get(key)-1);

        //     }
        // }
        // int[] ans = new int[list.size()];

        // for(int i=0;i<list.size();i++){
        //     ans[i]=list.get(i);
        // }
        // return ans;

        //Using freq array:
        int[] arr = new int[1001];

        for (int x : nums1) {
            arr[x]++;
        }

        int k = 0;

        for (int x : nums2) {
            if (arr[x] > 0) {
                nums2[k++] = x;
                arr[x]--;
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = nums2[i];
        }

        return ans;

    }
}