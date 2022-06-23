class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums,target), second(nums, target)};
        
    }
    
    int first(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int r = -1;
        
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                r = m;
                e = m - 1;
            }else if(arr[m] > target){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return r;
        
    }
    
    int second(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int r = -1;
        
        while(s <= e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                r = m;
                s = m + 1;
            }else if(arr[m] > target){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return r;
    } 
}