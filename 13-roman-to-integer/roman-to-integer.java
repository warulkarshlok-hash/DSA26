class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> map = new HashMap<>();

      map.put('I',1);
      map.put('V',5); 
      map.put('X',10); 
      map.put('L',50); 
      map.put('C',100); 
      map.put('D',500); 
      map.put('M',1000); 

      char[] arr = s.toCharArray();
      int sum = 0;
      for(int i = 0;i<arr.length;i++){
        int curr = map.get(arr[i]);
        
        if(i<arr.length-1 && curr< map.get(arr[i+1]) ){ //next : map.get(arr[i+1]
           sum-=curr;
        }
        else{
            sum+=curr;
        }
      }
        return sum;
    }
}