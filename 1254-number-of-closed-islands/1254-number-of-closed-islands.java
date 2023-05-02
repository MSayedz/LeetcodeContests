class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0 && !visited[i][j] && dfs(grid, visited, i, j)){
                    count ++;
                }
            }
        
        return count;
    }
    
    static boolean dfs(int[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1){
            return false;
        }
        if (grid[i][j] == 1 || visited[i][j]) {
            return true;
        }
        
        visited[i][j] = true;
        boolean isClosed = true;
        
        int[] DIR =  new int[] {0, 1, 0, -1, 0};
        
        for(int k=0;k<4;k++){
            int r = i + DIR[k];
            int c = j + DIR[k+1];
            
            if(!dfs(grid, visited, r, c)){
                isClosed = false;
            }
        }
        return isClosed;
    }
}