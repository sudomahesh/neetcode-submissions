class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            if(map.containsKey(dif)){ 
                int start = Math.min(map.get(dif), i);
                int end = Math.max(map.get(dif), i);
                return new int[]{start, end};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
