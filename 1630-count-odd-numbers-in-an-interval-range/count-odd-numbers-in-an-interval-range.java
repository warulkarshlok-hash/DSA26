// class Solution {
//     public int countOdds(int low, int high) {
//         int count = 0;
//         for(int num=low;num<=high;num++){

//             if(num%2==0){
//                 continue;
//             }
//             else{
//                 count++;
//             }
//         }
//         return count;
//     }
// }  //TLE in brute force

//FORMULA FOR ODD:
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
}

//FOR EVEN : 
//high / 2 - (low - 1) / 2