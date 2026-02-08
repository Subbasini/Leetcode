class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int max_area=0;
        int current=0;
        while(left<right){
            current=Math.min(height[left],height[right])*(right-left);
            max_area=Math.max(current,max_area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}