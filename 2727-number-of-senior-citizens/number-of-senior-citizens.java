class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0;i<details.length;i++){
            String PersonInfo = details[i];
            int age = Integer.parseInt(String.valueOf(PersonInfo.charAt(11)) + PersonInfo.charAt(12));
            if(age > 60) {count++;}
            age=0;
            
        }

        return count;
    }
}