class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;

        for(int i = 0; i < nums.length; i++){
            int ctr = 0;
            for(int j = i; j < nums.length; j++){
                ctr += nums[j];
                if(ctr == k) {
                    res++;
                }
            }
        }
            return res;
    }
}