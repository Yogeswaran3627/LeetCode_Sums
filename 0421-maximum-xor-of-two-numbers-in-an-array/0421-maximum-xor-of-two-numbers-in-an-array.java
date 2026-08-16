class Solution {
    public int findMaximumXOR(int[] a) {
        int m=0,k=0;
        for(int i=31;i>=0;i--){
            k|=1<<i;
            HashSet<Integer> s=new HashSet<>();
            for(int x:a) s.add(x&k);
            int c=m|(1<<i);
            for(int p:s){
                if(s.contains(p^c)){
                    m=c;
                    break;
                }
            }
        }
        return m;
    }
}