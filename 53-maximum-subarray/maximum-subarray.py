class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        csum=nums[0]
        maxsum=nums[0]
        for i in range(1,len(nums)):
            csum=max(nums[i],csum+nums[i])
            maxsum=max(csum,maxsum)

        return maxsum