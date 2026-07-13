class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] freq = new int[1001];

        for(int num : target){
            freq[num]++;
        }

        for(int key : arr){
            freq[key]--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                return false;
            }
        }

        return true;




        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int num : target){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int key : arr){
        //     if(map.containsKey(key) && map.get(key)>0){
        //         map.put(key, map.get(key) - 1);
                
        //     }
        //     else{
        //         return false;
        //     }
           
        // }
        // return true;
    }
}