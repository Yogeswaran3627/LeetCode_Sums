class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        ListNode d=new ListNode(0);
        ListNode t=d;
        int c=0;
        while(l1!=null||l2!=null){
            int sum=c;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            c=sum/10;
            t.next=new ListNode(sum%10);
            t=t.next;
        }
        if(c>0){
            t.next=new ListNode(c);
        }
        return d.next;
    }
}