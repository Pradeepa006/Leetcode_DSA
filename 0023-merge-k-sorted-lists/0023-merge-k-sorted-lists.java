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
    public static ListNode mergeTwo(ListNode res , ListNode h1){
    ListNode temp = new ListNode();
    ListNode curr = temp;
    while(res != null && h1 != null){
        if(h1.val < res.val){
            curr.next = h1;
            h1 = h1.next;
        }
        else {
            curr.next = res;
            res = res.next;
        }
        curr = curr.next;
    }
    curr.next = (res != null) ? res : h1;
    return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        ListNode res = lists[0];
        for(int i = 1 ; i < lists.length ; i++)
            res = mergeTwo(res , lists[i]);
        return res;
    }
}