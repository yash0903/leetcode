class Solution {
    public int searchInsert(int[] nums, int target) {
        // s = start index, e = end index, m = mid index 
        int s = 0;
        int e = nums.length-1;
        
        while(s<=e){
            int m = s + (e-s)/2;
            
            if(target > nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return s;
    }
}