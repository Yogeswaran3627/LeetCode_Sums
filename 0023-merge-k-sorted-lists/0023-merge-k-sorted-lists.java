class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0) return null;
        ListNode res=lists[0];
        for(int i=1;i<lists.length;i++){
            res=merge(res,lists[i]);
        }
        return res;
    }
    public ListNode merge(ListNode a,ListNode b){
        ListNode d=new ListNode(0);
        ListNode t=d;
        while(a!=null&&b!=null){
            if(a.val<b.val){
                t.next=a;
                a=a.next;
            }else{
                t.next=b;
                b=b.next;
            }
            t=t.next;
        }
        if(a!=null) t.next=a;
        if(b!=null) t.next=b;
        return d.next;
    }
}