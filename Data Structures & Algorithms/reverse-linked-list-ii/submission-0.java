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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode before = null;
        int position = 1;
        if(head == null || left == right){
            return head;
        }
        while(position < left){
            before = temp;
            temp = temp.next;
            position++;
        }
        ListNode current = temp;
        ListNode previous = null;
        int times = right -left +1;
        while(times>0){
            ListNode tempNode = current.next;
            current.next = previous;
            previous = current;
            current = tempNode;
            times--;
        }
        temp.next = current;
        if(before == null){
            return previous;
        }
        before.next = previous;
           return head;


        
    }
}