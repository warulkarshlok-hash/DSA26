class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }

        for(int num : nums1){
            if(map.containsKey(num)){
                int index = map.get(num);

                if(index == nums2.length-1) {
                        list.add(-1);
                        continue;
                }
                
                for(int j = index +1;j<nums2.length;j++){
                    if(nums2[j]>num){
                        list.add(nums2[j]);
                        break;
                    }
                    else if(j==nums2.length-1 && nums2[j] < num){
                        list.add(-1);
                    }
                }
                
            }
            else{
                list.add(-1);
            }
        }

        int[] ans = new int[list.size()];

        for(int k = 0;k<list.size();k++){
            ans[k]=list.get(k);
        }

        return ans;
    }
}