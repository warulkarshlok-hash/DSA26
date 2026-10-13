class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int  max  = Integer.MIN_VALUE;
      ArrayList<Boolean> list  = new ArrayList<>();

      for(int n : candies){
        if(n>max){
            max = n;
        }
      }

      for(int num : candies){
        if((num + extraCandies)>=max){
            list.add(true);
        }
        else{
            list.add(false);
        }
      } 

      return list; 
    }
}