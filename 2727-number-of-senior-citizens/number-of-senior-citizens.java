// class Solution {
//     public int countSeniors(String[] details) {
//         int count = 0;
//         for(int i = 0;i<details.length;i++){
//             String PersonInfo = details[i];
//             int age = Integer.parseInt(String.valueOf(PersonInfo.charAt(11)) + PersonInfo.charAt(12));
//             if(age > 60) {count++;}
//             age=0;

//         }

//         return count;
//     }
// }

class Solution {
    public int countSeniors(String[] d) {
       int count=0;
        for(int i=0;i<d.length;i++){
            String aged=d[i].substring(11,13);
            int ageds = Integer.parseInt(aged);
            if(ageds>60){
                count++;
            }
    }
    return count;
}}