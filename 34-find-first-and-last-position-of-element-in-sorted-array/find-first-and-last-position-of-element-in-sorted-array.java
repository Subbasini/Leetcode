class Solution {

    public static int firstOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2; 

        if (nums[mid] == target) {
            first = mid;
            end = mid - 1; 
                   
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return first;
    }

    public static int lastOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;   
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }

   public int[] searchRange(int[] nums, int target) {
      
        int f = firstOccurence(nums, target);
        int l = lastOccurence(nums, target);
        if (f == -1) {              
            return new int[]{-1, -1};
        }
        
        return new int[] {f,(l)};
    
} 
    }



    