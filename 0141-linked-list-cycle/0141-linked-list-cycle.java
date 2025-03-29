/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = new ListNode();
        ListNode fast = head;
        if(head==null){return false;}
        if(fast.next!=null){
            slow = head;
            fast = fast.next;
        }
        while(fast.next!=null && fast.next.next!=null && slow.next!=null){
            if(slow==fast)
            return true;
            fast= fast.next.next;
            slow = slow.next;
            System.out.println(fast.val+" ::: "+slow.val);
        }
        return false;
    }
}