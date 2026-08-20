class Solution {
    public int[] resultArray(int[] nums) {

   
    int n = nums.length;

    int[] arr1 = new int[n];
    int[] arr2 = new int[n];

    int s1 = 1;
    int s2 = 1;

    arr1[0] = nums[0];
    arr2[0] = nums[1];

    for (int i = 2; i < n; i++) {
        if (arr1[s1 - 1] > arr2[s2 - 1]) {
            arr1[s1++] = nums[i];
        } else {
            arr2[s2++] = nums[i];
        }
    }

    int[] result = new int[n];

    // Copy arr1
    for (int i = 0; i < s1; i++) {
        result[i] = arr1[i];
    }

    // Copy arr2
    for (int i = 0; i < s2; i++) {
        result[s1 + i] = arr2[i];
    }

    return result;
 
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // ArrayList<Integer> arr2 = new ArrayList<>();

        // arr1.add(nums[0]);
        // arr2.add(nums[1]);

        // for(int i = 2;i<nums.length;i++){
        //     if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
        //         arr1.add(nums[i]);
        //     }
        //     else{
        //         arr2.add(nums[i]);
        //     }
        // }
        // int[] result = new int[nums.length];

        // int k = 0;

        // // Add arr1 elements
        // for (int i = 0; i < arr1.size(); i++) {
        //     result[k++] = arr1.get(i);
        // }

        // // Add arr2 elements
        // for (int i = 0; i < arr2.size(); i++) {
        //     result[k++] = arr2.get(i);
        // }

        // return result;



    }
}