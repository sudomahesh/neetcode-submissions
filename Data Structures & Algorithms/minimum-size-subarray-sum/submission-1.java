class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int windSum = 0;

        while(r < nums.length){
            windSum += nums[r];

            while(windSum >= target){
                minLength = Math.min(minLength, r - l + 1);
                windSum -= nums[l];
                l++;
            }
            r++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}