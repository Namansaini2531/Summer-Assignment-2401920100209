class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s = head;  //it is the slow pointer
        ListNode f = head;  // it is the fast pointer
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
