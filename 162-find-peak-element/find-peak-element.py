class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        
        peak=0
        for r in range(1,len(nums)):
            if nums[r-1]<nums[r]:
                peak=r
        return peak
