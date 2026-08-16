class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        counts = {}
        for n in nums:
            counts[n] = counts.get(n, 0) + 1
        for n in counts:
            if counts[n] == 1:
                return n
