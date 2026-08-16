public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head  == null) return false;
        ListNode x = head;
        ListNode y = head.next;
    
        while (y != null && y.next != null) {
            if (x == y) {
                return true;
            }
            x = x.next;
            y = y.next.next;
        }
    
        return false;
    }
}