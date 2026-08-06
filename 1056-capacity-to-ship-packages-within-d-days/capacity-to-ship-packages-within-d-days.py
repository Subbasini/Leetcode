class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        l=max(weights)
        r=sum(weights)
        ans=r
        while l<=r:
            c=l+(r-l)//2

            d=1
            curr=0

            for w in weights:
                if curr+w >c:
                    d+=1
                    curr=w
                else:
                    curr=curr+w

            if d<=days:
                ans=c
                r=c-1

            else:
                l=c+1
        return ans