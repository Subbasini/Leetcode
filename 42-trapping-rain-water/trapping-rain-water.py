class Solution:
    def trap(self, height: List[int]) -> int:
        l,r=0,len(height)-1
        max_left=0
        max_right=0
        total=0
        while l<r:
            if height[l]<height[r]:
                max_left=max(height[l],max_left)
                print("max_left:",max_left)
                if height[l]<max_left:
                    total+=max_left-height[l]
                    
            
                l+=1
                    
            else:
                max_right=max(height[r],max_right)
                if height[r]<max_right:
                    total+=max_right-height[r]
                    
                r-=1
                
        
        return total
