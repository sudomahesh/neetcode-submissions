class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        int start=0;
        int end=0;

        for(int i=0; i<nums.length; i++){
            int temp = target -  nums[i];
            if(map.containsKey(temp)){
                start =Math.min(map.get(temp), i);
                end =Math.max(map.get(temp), i);
            }
            else{
                map.put(nums[i], i);
            }
        }

        return new int[]{start, end};
    }
}
