class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        // Step 1: store values in array
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Step 2: sort array
        Collections.sort(list);

        // Step 3: put sorted values back
        temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

        return head;
    }
}