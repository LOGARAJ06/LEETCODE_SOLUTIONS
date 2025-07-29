class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        int[][] ans = new int[r][c];
        for(int i=0;i<r;i++){
            if(obstacleGrid[i][0]==0){
                ans[i][0] = 1;
            }else{
                break;
            }
        }
        for(int j=0;j<c;j++){
            if(obstacleGrid[0][j]==0){
                ans[0][j] = 1;
            }else{
                break;
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(obstacleGrid[i][j]!=1){
                    ans[i][j] = ans[i-1][j] + ans[i][j-1];
                }
            }
        }
        return ans[r-1][c-1];
    }
}