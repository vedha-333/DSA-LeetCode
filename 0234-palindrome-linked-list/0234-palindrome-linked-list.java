class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.append(head.val);
            head = head.next;
        }
        return s.toString().equals(s.reverse().toString());
    }
}