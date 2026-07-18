class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r=0,len(height)-1
        max_area=0
        while(l<r):
            width=r-l
            h=min(height[l],height[r])
            area=width*h
            max_area=max(area,max_area)
            if height[l]<height[r]:
                l+=1
            elif height[l]==height[r]:
                l+=1
            else:
                r-=1
        return max_area