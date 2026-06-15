public class Solution{
    public boolean hasCycle(ListNode head) {
        ListNode l = head;
        ListNode r = head;

        while(r != null && r.next != null){
          
            l = l.next;
            r = r.next.next;
          
            if(l == r){
              return true;
            }
        }
        return false;
    }
}
