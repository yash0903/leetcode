class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                temp.add(nums[i]);
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] % 2 != 0){
                temp.add(nums[j]);
            }
        }
        
        int[] ans = new int[nums.length];
        
        for(int k = 0 ; k < temp.size(); k++){
            ans[k] = temp.get(k);
        }
        return ans;
    }
}