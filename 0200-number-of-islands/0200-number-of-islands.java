class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    zeros(grid,i,j);
                }
            }
        }
        return count;

    }
    public void zeros(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1 || grid[i][j]=='0'){
            return;
        } 
        grid[i][j] = '0';
        zeros(grid,i+1,j);
        zeros(grid,i-1,j);
        zeros(grid,i,j+1);
        zeros(grid,i,j-1);
    }
}