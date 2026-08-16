class Solution:
    def maxPower(self, s: str) -> int:
        m = 1
        c = 1        
        for i in range(len(s) - 1):
            if s[i] == s[i+1]:
                c += 1
                if c > m:
                    m = c
            else:
                c = 1                
        return m
