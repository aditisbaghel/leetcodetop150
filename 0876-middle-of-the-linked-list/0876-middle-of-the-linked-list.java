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
int length = 0;
ListNode prev = head;
int mid = 0;

while(prev.next!=null){
prev=prev.next;
length++;
}
mid = length/2+length%2;

for(int i = 0;i<mid;i++){
head = head.next;
}
return head;
    }
}