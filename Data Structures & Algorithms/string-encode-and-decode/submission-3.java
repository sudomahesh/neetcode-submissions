class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for(String str : strs){
            String s = str.length() + "#" + str; 
            res.append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        int i = 0;  // currentPos

        while( i < str.length()){
            int j = i;

            while(str.charAt(j) != '#') j++;

            int wordLength = Integer.parseInt(str.substring(i, j));

            res.add(str.substring(j + 1, j + 1 + wordLength));
            i = j + 1 + wordLength;
        }

        return res;
    }
}
