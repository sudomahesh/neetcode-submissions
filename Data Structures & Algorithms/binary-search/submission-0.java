class Solution {
    public int binarySearch(int l, int r, int[] nums, int target){
        if(l > r) return -1;

        int mid = l + (r-l) / 2;

        if(nums[mid] == target) return mid;

        if(nums[mid] > target){
            return binarySearch(l, mid - 1, nums, target);
        }
        else{
            return binarySearch(mid + 1, r, nums, target);
        }
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
}
