class Solution {
    public int minimumOperations(int[][] grid) {
    int ans = 0;
    for(int c = 0; c < grid[0].length; ++c){
        for(int r = 1; r < grid.length; ++r){
            if(grid[r][c] <= grid[r-1][c]) { 
                ans += grid[r-1][c] + 1 - grid[r][c];
                grid[r][c] = grid[r-1][c] + 1;
            }
        }
    }
    return ans;
    }
}