class Solution {
    public boolean containsDuplicate(int[] nums) {
//         int i = 0;
//         while(i<nums.length){
//             int correct = nums[i]-1;
//             if (nums[i] != nums[correct]){
//                 swap(nums,i,correct);
//             }else{
//                 i++;
//             }
//         }
        
//         for(int index = 0; index<nums.length; index++){
//             if(nums[index] != i+1){
//                 return true;
//             }
//         }
//         return false;
        
//     }
    
//     void swap(int[] arr, int first, int second){
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
        
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
    
}