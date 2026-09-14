class Solution {
    public int[] getConcatenation(int[] nums) {
//         int length = nums.length;
//         int [] ans = new int[2*length];
// int index = 0;
   int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        
        return ans;


        
    }
}