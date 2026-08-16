class Solution(object):
    def bitwiseComplement(self, n):
        if n==0:
            return 1
        m=1
        while m<=n:
            m<<=1
        return m-1-n