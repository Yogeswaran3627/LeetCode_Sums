class Solution:
    def binaryGap(self, n: int) -> int:
        b = bin(n)[2:]
        l = -1
        ans = 0
        for i in range(len(b)):
            if b[i] == '1':
                if l != -1:
                    d = i - l
                    if d > ans:
                        ans = d
                l = i
        return ans