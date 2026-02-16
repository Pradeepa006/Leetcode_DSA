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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;

        // 0, 
        while (l1!=null || l2!=null || carry!=0) {
            if (l1 == null) l1 = new ListNode(0);
            if (l2 == null) l2 = new ListNode(0);

            int sum = l1.val + l2.val + carry; //7
            carry = sum/10; //0
            curr.next = new ListNode(sum%10); //7
            curr = curr.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head.next;
    }
}