class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode a = new ListNode(0);
        a.next = head;

        ListNode prev = a;

        
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        
        for (int i = 0; i < right - left; i++) {
            ListNode temp = curr.next;

            curr.next = temp.next;   
            temp.next = prev.next;   
            prev.next = temp;        

        }

        return a.next;
    }
}