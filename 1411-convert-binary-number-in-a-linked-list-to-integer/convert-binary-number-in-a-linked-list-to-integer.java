/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {

        String binary = "";
        ListNode curr = head;
        while(curr != null){
            binary += curr.val;
            curr = curr.next;
        }

        int dec = 0;
        int pos = 0;
        for(int i = binary.length()-1;i>=0;i--){
            char c = binary.charAt(i);
            if(c=='1') {
                dec += Math.pow(2, pos);
            }
            pos++;
        }
        
        return dec;
    }
}