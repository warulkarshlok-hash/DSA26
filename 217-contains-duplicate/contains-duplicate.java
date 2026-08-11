class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        return set.size() != nums.length;
  
    }
}