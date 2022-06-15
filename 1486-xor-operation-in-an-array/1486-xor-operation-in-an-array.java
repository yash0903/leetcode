class Solution {
    public int xorOperation(int n, int start) {
        // int[] nums = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
           ans^= start + 2 * i;
            // nums[i];
        }
        // for(int j = 0; j < nums.length; j++){
        //     ans^=nums[j];
        // }
        return ans;
    }
}