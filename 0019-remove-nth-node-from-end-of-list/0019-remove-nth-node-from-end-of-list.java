class Solution {
    public ListNode removeNthFromEnd(ListNode head,int n) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode p1=d;
        ListNode p2=d;
        for(int i=0;i<=n;i++){
            p1=p1.next;
        }
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=p2.next.next;
        return d.next;
    }
}