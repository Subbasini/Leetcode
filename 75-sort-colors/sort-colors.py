class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l,r=0,len(nums)-1
        read=0
        while read<=r:
            if nums[read]==0:
                temp=nums[l]
                nums[l]=nums[read]
                nums[read]=temp
                l+=1
                read+=1

            elif nums[read]==1:
                read+=1

            else:
                temp=nums[r]
                nums[r]=nums[read]
                nums[read]=temp
                r-=1

        return nums
