class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: Get total length of the list
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Iterate with increasing sublist sizes: 1, 2, 4, 8...
        for (int size = 1; size < length; size <<= 1) {  // size <<= 1 means size *= 2

            ListNode curr = dummy.next;  // start of unsorted portion
            ListNode tail = dummy;       // end of sorted portion

            while (curr != null) {
                // Step 3: Split into left and right halves of current size
                ListNode left = curr;
                ListNode right = split(left, size);   // right starts after 'size' nodes
                curr = split(right, size);             // curr = whatever remains after right

                // Step 4: Merge left and right, attach result to tail
                tail.next = merge(left, right);

                // Step 5: Advance tail to end of merged portion
                while (tail.next != null) tail = tail.next;
            }
        }

        return dummy.next;
    }

    // Cuts list after 'size' nodes, returns head of second part
    //
    // Example: split([1->2->3->4->5], 2)
    //   walks 1 step (size-1=1): stops at node(2)
    //   cuts:  [1->2]  [3->4->5]
    //   returns head of [3->4->5]
    private ListNode split(ListNode head, int size) {
        // Walk (size - 1) steps forward
        for (int i = 1; i < size && head != null; i++) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode rest = head.next;  // save second half
        head.next = null;           // cut the link
        return rest;                // return second half
    }

    // Merges two sorted linked lists
    //
    // Example: merge([1->4], [2->3])
    //   1<2 → take 1  →  [1]
    //   4>2 → take 2  →  [1->2]
    //   4>3 → take 3  →  [1->2->3]
    //   take 4        →  [1->2->3->4]
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // Attach remaining nodes
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
