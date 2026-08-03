class Solution:
    def minimumPushes(self, word: str) -> int:
        n=len(word)
        res=0
        freq={}
        for i in word:
            freq[i]=freq.get(i,0)+1
        
        freqs=list(freq.values())
        freqs.sort(reverse=True)
        for i,n in enumerate(freqs):
            cost=(i//8)+1
            res+=(n*cost)
        return res
