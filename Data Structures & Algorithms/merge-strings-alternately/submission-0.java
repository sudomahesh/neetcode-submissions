class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int ctr1 = 0;
        int ctr2 = 0;

        while(ctr1 < word1.length() && ctr2 < word2.length()){
            sb.append(word1.charAt(ctr1));
            sb.append(word2.charAt(ctr2));
            ctr1++;
            ctr2++;
        }
        sb.append(word1.substring(ctr1));
        sb.append(word2.substring(ctr2));

        return sb.toString();
    }
}