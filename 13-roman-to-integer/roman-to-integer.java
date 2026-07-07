class Solution {
    public int romanToInt(String s) {
    //   HashMap<Character,Integer> map = new HashMap<>();

    //   map.put('I',1);
    //   map.put('V',5); 
    //   map.put('X',10); 
    //   map.put('L',50); 
    //   map.put('C',100); 
    //   map.put('D',500); 
    //   map.put('M',1000); 

    // //   char[] arr = s.toCharArray();
    // //   int sum = 0;
    // //   for(int i = 0;i<arr.length;i++){
    // //     int curr = map.get(arr[i]);
        
    // //     if(i<arr.length-1 && curr< map.get(arr[i+1]) ){ //next : map.get(arr[i+1]
    // //        sum-=curr;
    // //     }
    // //     else{
    // //         sum+=curr;
    // //     }
    // //   }
    // //     return sum;
    //  int result = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         int curr = map.get(s.charAt(i));
    //         int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

    //         if (curr < next) {
    //             result -= curr;
    //         } else {
    //             result += curr;
    //         }
    //     }

    //     return result;

     
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    
    }
}