class Solution:
    def countBits(self, n: int):
        a = []

        for x in range(n + 1):
            c = 0
            y = x

            while y > 0:
                c += y & 1
                y = y >> 1

            a.append(c)

        return a