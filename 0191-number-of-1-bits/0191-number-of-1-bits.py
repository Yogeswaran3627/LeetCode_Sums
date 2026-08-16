class Solution:
    def hammingWeight(self, n: int):
        b = format(n, 'b')
        c = 0 
        for x in b:
            if x == '1':
                c = c+1
        return c