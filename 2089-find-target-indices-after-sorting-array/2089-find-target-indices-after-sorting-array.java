class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                ans.add(i);
            }
        }
        
//         int s = 0;
//         int e = nums.length;
        
//         while(s <= e){
//             int m = s + (e-s)/2;
//             if(target > nums[m]){
//                 s = m + 1;
//             }else if(target < nums[m]){
//                 e = m - 1;
//             }else{
//                 ans.add(m);
//             }
//         }
        return ans;
    }
}