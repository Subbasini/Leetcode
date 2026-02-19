class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(m.containsKey(rem)){
                int prev=m.get(rem);
                if(i-prev>=2){

                    return true;
                }
            }
                else{
                    m.put(rem,i);
                }
            
        }
        return false;
    }
}