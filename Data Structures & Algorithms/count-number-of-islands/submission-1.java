class Solution {
    private static final int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int island = 0;

        for(int r = 0; r < rows; r++){
            for(int c =0; c < cols; c++){
                if(grid[r][c] == '1'){
                    dfs(grid, r, c);
                    island++;
                }
            }
        }

        return island;
    }

    private void dfs(char[][] grid, int r , int c){
        if(
            r < 0 || r >= grid.length ||
            c < 0 || c >= grid[0].length ||
            grid[r][c] == '0'
        ) return;

        grid[r][c] = '0';
        for(int[] dr : directions){
            dfs(grid, r + dr[0] , c + dr[1]);
        }
    }
}
