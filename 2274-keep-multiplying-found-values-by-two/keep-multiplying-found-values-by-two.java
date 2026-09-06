class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        
        
        int next = original;
        while(set.contains(next)){
            next *= 2;
            
        }

        return next;
    }
}