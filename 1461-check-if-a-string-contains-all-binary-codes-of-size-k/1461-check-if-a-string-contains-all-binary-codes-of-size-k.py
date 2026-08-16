class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        a = set()       
        for i in range(len(s) - k + 1):
            sub = s[i:i+k]
            a.add(sub)        
        if len(a) == 2**k:
            return True       
        return False