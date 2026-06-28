class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int min = nums[0];
        int max = nums[0];

        
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for(int i = 0  ; i < nums.length ;i++){
            set.add(nums[i]);
        }
        for(int j = min; j<=max ; j++ ){
            if(!set.contains(j)){
                ans.add(j);
                
            }
        }
        
        return ans;
        
    }
}