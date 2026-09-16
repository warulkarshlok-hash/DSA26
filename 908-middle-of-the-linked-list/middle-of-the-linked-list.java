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
    public ListNode middleNode(ListNode head) {
        ListNode list = new ListNode();
        if (head == null)
            return null;

        ListNode temp = head;
        int cnt = 0;

        // Count the number of nodes
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // Find the position of the middle node
        cnt = (cnt / 2) + 1;

        // Move to the middle node
        temp = head;
        while (--cnt > 0) {
            temp = temp.next;
        }

        return temp;
    }
}