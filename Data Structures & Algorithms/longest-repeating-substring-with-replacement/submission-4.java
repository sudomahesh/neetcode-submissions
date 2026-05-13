class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> countMap = new HashMap();
        int l = 0;
        int r = 0;
        int max = 0;
        int maxf = 0;

        while(r < s.length()){
            countMap.put(s.charAt(r), countMap.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, countMap.get(s.charAt(r)));

            while((r - l + 1) - maxf > k){
                countMap.put(s.charAt(l), countMap.get(s.charAt(l)) - 1);
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}
