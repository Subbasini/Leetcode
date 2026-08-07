class Solution:
    def minSpeedOnTime(self, dist: List[int], hour: float) -> int:
        l=1
        r=10**7
        ans=-1
        while l<=r:
            mid=l+(r-l)//2
            time=0
            for i in range(len(dist)-1):
                t=math.ceil(dist[i]/mid)
                time+=t

            time+=dist[-1]/mid

            if time<=hour:
                ans=mid
                r=mid-1
            else:
                l=mid+1
        return ans
