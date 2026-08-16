class Solution:
    def checkZeroOnes(self, s: str) -> bool:
        c0 = 0
        c1 = 0
        m0 = 0
        m1 = 0 
        
        for i in s:
            if i == '1':
                c1 += 1
                c0 = 0
                if c1 > m1:
                    m1 = c1
            else:
                c0 += 1
                c1 = 0
                if c0 > m0:
                    m0 = c0
                    
        return m1 > m0
