class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int l = 0;
        int r = 0;
        int maxLength =0;

        while(r < s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return maxLength;
    }
}
