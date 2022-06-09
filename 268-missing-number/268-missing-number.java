class Solution {
    public int missingNumber(int[] nums) {
        int i = 0; 
        while(i < nums.length){
        if(nums[i]<nums.length && nums[i] != i){
            swap(nums, nums[i], i);
            }else{
                i++;
            }
        }
        
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}