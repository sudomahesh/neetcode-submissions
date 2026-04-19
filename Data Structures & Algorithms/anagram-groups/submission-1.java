class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();

        for (String str : strs) {

            List<Integer> count =
                new ArrayList<>(Collections.nCopies(26, 0));

            for (char c : str.toCharArray()) {
                int idx = c - 'a';
                count.set(idx, count.get(idx) + 1);
            }

            List<Integer> key = new ArrayList<>(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(count).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
