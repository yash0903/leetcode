class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = searchInLeft(nums,target);
        int b = searchInRight(nums,target);
        return new int[] {a,b};
    }
    
    int searchInLeft(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int r = -1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                r = m;
                e = m-1;
            }else if(nums[m] > target){
                e = m -1;
            }else{
                s = m + 1;
            }
        }
        return r;
    }
    
    int searchInRight(int[] nums, int target){
        int s  = 0;
        int e = nums.length-1;
        int r = -1;
        
        while(s <= e){
            int m = s + (e-s)/2;
            if(nums[m] == target){
                r = m;
                s = m + 1;
            }else if(nums[m] > target){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return r;
    }
}