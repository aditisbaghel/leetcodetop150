class Solution {
    public int minPathSum(int[][] grid) {
    int bottom = grid.length-1; //no. of rows m
    int right = grid[0].length-1; //no. of columns n
    if(grid.length==0)
    return 0;
        for(int i=0;i<=bottom;i++){
        for(int j=0;j<=right;j++){
            if(i==0 && j==0)
                continue;
            else if(i==0)
                grid[i][j]+=grid[i][j-1];
            else if(j==0)
                grid[i][j]+=grid[i-1][j];
            else
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
        }

    }
    return grid[bottom][right];
}}