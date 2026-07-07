class Solution {
    public int sumOfUnique(int[] nums) {
    //  HashMap<Integer,Integer> map = new HashMap<>();
    //  for(int num : nums){
    //     map.put(num,map.getOrDefault(num,0)+1);
        
    //  }
    //  int ans = 0;
    //  for(int key : map.keySet()){
    //     if(map.get(key)==1){
    //         ans+=key;
    //     }
    //  }    
    //  return ans;
    int[] freq = new int[101];
    int sum = 0;
    for(int num : nums){
        freq[num]++;
    }
    for(int i=1;i<freq.length;i++){
        if(freq[i]==1){
            sum+=i;
        }
    }
    return sum;
    }
}