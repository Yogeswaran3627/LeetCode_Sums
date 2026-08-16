class Solution(object):
    def minFlips(self, s):
        n = len(s)
        s = s + s
        ans1, ans2 = 0, 0
        res = float('inf')
        for i in range(len(s)):
            if s[i] != str(i % 2):
                ans1 += 1
            if s[i] != str((i + 1) % 2):
                ans2 += 1            
            if i >= n:
                if s[i - n] != str((i - n) % 2):
                    ans1 -= 1
                if s[i - n] != str((i - n + 1) % 2):
                    ans2 -= 1           
            if i >= n - 1:
                res = min(res, ans1, ans2)               
        return res