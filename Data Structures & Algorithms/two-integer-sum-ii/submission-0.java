class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum =0;
        int l =0;
        int r = numbers.length -1;

        while(r > l){
            if(numbers[r] + numbers[l] == target){
                return new int[]{l+1, r+1};
            }

            if(numbers[r] + numbers[l] > target){
                r--;
            }
            else{
                l++;
            }
        }

        return new int[]{};
    }
}
