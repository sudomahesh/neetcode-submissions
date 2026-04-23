class Solution {
    public int bst(int l, int r, int[] nums, int target){
        if(l > r) return -1;

        int mid = l + (r-l) / 2;

        if(nums[mid] == target) return mid;

        if(nums[mid] > target){
            return bst(l, mid - 1, nums, target);
        }
        else{
            return bst(mid + 1, r, nums, target);
        }
    }

    public int search(int[] nums, int target) {
        return bst(0, nums.length - 1, nums, target);
    }
}
