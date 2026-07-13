class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 1;
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,i);
                i++;
            }
            else{
                continue;
            }
        }
        int j = 0;
        for(int key : arr){
            nums[j]=map.get(key);
            j++;
        }
        return nums;

    }
}