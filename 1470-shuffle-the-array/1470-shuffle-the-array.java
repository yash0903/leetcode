class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        
        int i, j;
        for(i=0,j=0; j < n; i += 2, j++){
            arr[i] = nums[j];
            arr[i+1] = nums[j+n]; 
        }
        return arr;
    }
}



