class Solution {
    public void reorderList(ListNode head) {

        ArrayList<ListNode> a = new ArrayList<>();
        while (head != null) {
            a.add(head);
            head = head.next;
        }

        int i = 0, j = a.size() - 1;

       
        while (i < j) {
            a.get(i).next = a.get(j);
            i++;

            a.get(j).next = a.get(i); 
            j--;
        }

        a.get(i).next = null; 
    }
}