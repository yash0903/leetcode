class Solution {
    public int[] searchRange(int[] arr, int target) {
        int a1 = first(arr, target);
        int a2 = second(arr, target);
        
        return new int[] {a1,a2};
    }
    
    int first(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int r = -1;
        
        while(s <= e){
            int m = s + (e-s)/2;
            if(target == arr[m]){
                r = m;
                e = m - 1;
            }else if(target < arr[m]){
                e = m -1;
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
            
            if(target == arr[m]){
                r = m;
                s = m + 1; 
            }else if(target < arr[m]){
                e = m - 1;
            }else {
                s = m + 1;
            }
        }
        return r;
    }
}