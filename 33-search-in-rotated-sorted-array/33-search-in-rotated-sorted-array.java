class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]< nums[i-1]){
                pivot = i-1;
            }
        }
        
        int a = searchInRight(nums, pivot, target);
        int b = searchInLeft(nums, pivot, target);
        
        if(a == -1){
            return b;
        }else{
            return a;
        }
    }
    
    int searchInRight(int[] nums, int pivot, int target){
        int s = pivot+1;
        int e = nums.length-1;
        
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m] == target){
                return m;
            }else if(target > nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
    
    int searchInLeft(int[] nums, int pivot, int target){
        int s = 0;
        int e = pivot;
        
        while(s <= e){
            int m = s+(e-s)/2;
            if(nums[m] == target){
                return m;
            }else if(target>nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
}