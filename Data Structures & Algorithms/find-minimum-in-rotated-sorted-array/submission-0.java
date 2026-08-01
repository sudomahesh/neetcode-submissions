class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length -1 ;
        int min = Integer.MAX_VALUE;

        while(l <= r){
            int mid = (r+l)/2;

            if(nums[l] <= nums[mid]){ // left is sorted -> take min and eliminate 
                min = Math.min(min, nums[l]);
                l = mid + 1;
            }
            else{  // right is shorted -> take min and eliminate 
                min = Math.min(min, nums[mid]);
                r = mid - 1;
            }
        }

        return min;
    }
}
