class Solution(object):
    def majorityElement(self, nums):
        c = {}
        t = len(nums) // 2        
        for num in nums:
            c[num] = c.get(num, 0) + 1
            if c[num] > t:
                return num