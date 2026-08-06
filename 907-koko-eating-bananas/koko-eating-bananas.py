class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        r=max(piles)
        l=1
        ans=0
        while l<=r:
            k=l+(r-l)//2
            hour=0
            for p in piles:
                hour+=(p+k-1)//k

            if hour<=h:
                ans=k
                r=k-1
            else:
                l=k+1
        

        return ans