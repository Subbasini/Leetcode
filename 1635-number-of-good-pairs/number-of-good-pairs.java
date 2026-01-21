class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] freq=new int[105];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]+=1;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                int n=freq[i];
                count+=n*(n-1)/2;
            }
        }

        
        
        
        
        return count;
}
}