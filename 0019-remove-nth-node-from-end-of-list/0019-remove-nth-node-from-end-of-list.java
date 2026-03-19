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
        int length = 0 ; // length initilazate
        ListNode temp = head ; //temp is the head

        //count the length 
        while (temp != null){
            length++;
            temp = temp.next;
        }

        //length is equal then remove the first node and return all node 
        if (length == n){
            return head.next;
        }
        
        //Find the position 
        int position = length - n ;

        // current node is head to remove the postion next node 
        ListNode current = head;
        for (int i = 1 ; i < position ; i++){
            current = current.next;
        }

        //current which was pointing to the next node it will replace the next node pointing 
        // if that next node is not pointing to anyone then it collected by garbage collector 
        current.next = current.next.next;

         return head ;
    }
}