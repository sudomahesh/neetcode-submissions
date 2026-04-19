class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let set = new Set(nums);

        if(set.size === nums.length){
            return false;
        }

        return true;
    }
}
