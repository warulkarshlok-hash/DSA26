class Solution {
    public int maxProduct(int n) {

    
        int max1 = 0, max2 = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            n /= 10;
        }

        return max1 * max2;
    }
}  

    //7ms
    //     ArrayList<Integer> list =  new ArrayList<>();
    //     while(n>0){
    //         int digit = n%10;
    //         list.add(digit);
    //         n=n/10;
    //     }
    //     Collections.sort(list);
    //     int k = list.size();
    //     return list.get(k-1)*list.get(k-2);
    // 
