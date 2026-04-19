class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int maxLength = 0;
        
        for(int num : nums){
            set.add(num);
        }

        for(int n : nums){
            if(!set.contains(n - 1)){
                int len = 1;
                while(set.contains(n + len)){
                    len++;
                }
                maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;
    }
}
