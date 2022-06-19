class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        
        int[] ans = new int[2];
        for(int index = 0; index< nums.length; index++){
            if(nums[index] != index+1){
                ans[0] = nums[index];
                ans[1] = index+1;
            }
        }
        return ans;
        
    }
    
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}