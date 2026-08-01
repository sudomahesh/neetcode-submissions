class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int leftmost_idx = -1;

        while(l <= r){
            int mid = (r + l) / 2;

            if(target == nums[mid]){
                leftmost_idx = mid;
                r = mid - 1;
            }
            else if(target < nums[mid]){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        l = 0;
        r = nums.length - 1;
        int rightmost_idx = -1;

        while(l <= r){
            int mid = (r+l)/2;

            if(nums[mid] == target){
                rightmost_idx = mid;
                l = mid + 1;
            }
            else if(target < nums[mid]){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        

        return new int[]{leftmost_idx, rightmost_idx};
    }
}