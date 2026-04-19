class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            int def = target - nums[i];
            if(map.containsKey(def)){
                start = Math.min(map.get(def), i);
                end = Math.max(map.get(def), i);
                return new int[]{start, end};
            }
            else{
                map.put(nums[i], i);
            }
        }

        return new int[]{start, end};
    }
}
