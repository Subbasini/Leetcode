class Solution {
    public int findMaxLength(int[] nums) {
  int sum=0;
  int max=0;
  HashMap<Integer,Integer> h=new HashMap<>();
  h.put(0,-1);
  for(int i=0;i<nums.length;i++){
    sum += (nums[i] == 0) ? -1 : 1;
    if(h.containsKey(sum)){
        max=Math.max(max,i-h.get(sum));
    }
    else{
        h.put(sum,i);
    }

    
  }

    return max;

    }  
}