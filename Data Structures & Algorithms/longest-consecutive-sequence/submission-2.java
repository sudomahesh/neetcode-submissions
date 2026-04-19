class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet();

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(!set.contains(num-1)){
                int len = 0;
                while(set.contains(num + len)){
                    len++;
                }
                max = Math.max(max, len);
            }
        }

        return max;
    }
}
