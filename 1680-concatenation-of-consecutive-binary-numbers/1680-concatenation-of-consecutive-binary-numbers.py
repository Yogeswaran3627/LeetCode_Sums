class Solution:
    def concatenatedBinary(self, n: int) -> int:
        MOD = 10**9 + 7
        s = ""
        for x in range(1, n + 1):
            b = format(x, 'b')
            s +=b
        return int(s, 2) % MOD