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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0 ;
        ListNode temp = head ;

        while (temp != null){
            length++;
            temp = temp.next;
        }

        if (length == n){
            return head.next;
        }

        int position = length - n ;
        ListNode current = head;
        for (int i = 1 ; i < position ; i++){
            current = current.next;
        }
        current.next = current.next.next;

         return head ;
    }
}