class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxLeft = height[0];
        int maxRight = height[height.length -1];

        int max = 0;

        while( r > l){
            if(maxLeft < maxRight){
                l++;
                maxLeft = Math.max(maxLeft, height[l]);
                max += maxLeft - height[l];
            }
            else{
                r--;
                maxRight = Math.max(maxRight, height[r]);
                max += maxRight - height[r]; 
            }
        }

        return max;
    }
}
