class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a = null;  //previous
        ListNode b = head;  //current

        while (b != null) {
            ListNode next = b.next;
            b.next = a;          
            a = b;               
            b = next;               
        }
        return a;
    }
}
