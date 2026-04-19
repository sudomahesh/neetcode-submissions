class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int min = r;

        while(r >= l){
            int k = (l + r) / 2;

            int totalHours = 0;
            for(int p : piles){
                totalHours += Math.ceil((double) p / k);
            }

            if(totalHours <= h){
                min = k;
                r = k - 1;
            }
            else{
                l = k + 1;
            }
        }

        return min;
    }
}
