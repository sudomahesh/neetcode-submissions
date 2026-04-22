class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap();

        for(String str : strs){
            List<Integer> count = new ArrayList(Collections.nCopies(26,0));

            for(char ch : str.toCharArray()){
                int idx = ch - 'a';
                count.set(idx, count.get(idx) + 1);
            }

            map.putIfAbsent(count, new ArrayList<String>());
            map.get(count).add(str);
        }

        return new ArrayList(map.values());
    }
}
