class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        //brute force approach
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                temp.add(matrix[i][j]);
            }
        }
        
        int[] ans = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++){
            ans[i] = temp.get(i);
        }
        
        Arrays.sort(ans);
        return ans[k-1];
    }
}