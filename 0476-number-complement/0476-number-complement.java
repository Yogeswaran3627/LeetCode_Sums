class Solution {
    public int findComplement(int num) {
        int m = 0;
        int t = num;
        while (t > 0) {
            m = (m << 1) | 1;
            t >>= 1;
        }
        return num ^ m;
    }
}