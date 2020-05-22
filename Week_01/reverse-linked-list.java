class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode curr = null;
        while (prev != null) {
            ListNode Temp = prev.next;
            prev.next = curr;
            curr = prev;
            prev = Temp;
        }
        return curr;
    }
}