class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l1 = len(nums)
        l2 = l1*(l1+1)//2
        return l2-sum(nums)