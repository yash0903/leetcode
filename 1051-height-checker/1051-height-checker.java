class Solution {
    public int heightChecker(int[] heights) {
        int[] correct = new int[heights.length]; // int correct[] = heights.clone(); can also be used
        for(int i = 0; i < heights.length; i++){ 
            correct[i] = heights[i];
        }
        
        Arrays.sort(heights);
        
        int counter = 0;
        for(int j = 0; j < heights.length; j++){
            if(heights[j] != correct[j]){
                counter++;
            }
        }
        return counter;
    }
}

