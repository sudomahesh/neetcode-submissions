class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int max = 0;

        for(int n : nums){
            set.add(n);
        }

        for(int n : set){
            if(!set.contains(n - 1)){
                int len = 0;
                while(set.contains(n + len)){
                    len++;
                }
                max = Math.max(max, len);
            }
        }

        return max;
    }
}
