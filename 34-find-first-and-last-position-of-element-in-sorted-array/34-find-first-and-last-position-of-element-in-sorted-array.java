class Solution {
    public int[] searchRange(int[] nums, int target) {
        //optimal solution
        int a = first(nums,target);
        int b = second(nums,target);
        
        return new int[] {a,b};
    }
    
    int first(int[] arr, int target){
        int s = 0;
        int e =arr.length-1;
        int r = -1;
        
        while(s <= e){
            int m = s + (e-s)/2;
            if(target > arr[m]){
                s = m + 1;
            }else if (target < arr[m]){
                e = m - 1;
            }else {
                r = m;
                e = m - 1;
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
            if(target > arr[m]){
                s = m + 1;
            }else if(target < arr[m]){
                e = m - 1;
            }else {
                r = m;
                s = m + 1;
            }
        }
        return r;
    }
}