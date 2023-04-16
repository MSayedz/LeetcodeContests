class Solution {
    class Cell {
        int row; int col;
        
        public Cell(int row, int col){
            this.row = row;
            this.col = col;
        }
        
        public int getRow(){return this.row;}
        public int getCol(){return this.col;}
    }
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    
    public int numIslands(char[][] grid) {
        int numOfIslands =0;
        
        Queue<Cell> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    numOfIslands ++;
                    queue.offer(new Cell(i,j));
                    grid[i][j] = '0';
                    
                    while(!queue.isEmpty()){
                        Cell cur = queue.poll();
                        
                        for(int k=0; k<4;k++){
                            int nr = cur.getRow() + DIR[k];
                            int nc = cur.getCol() + DIR[k+1];
                            if(nr < 0 || nc < 0 
                               || nr>grid.length-1 || nc>grid[0].length-1
                              || grid[nr][nc] == '0')
                                continue;
                            grid[nr][nc] = '0';
                            queue.offer(new Cell(nr, nc));
                        }
                    }
                }
            }
        
        return numOfIslands;
    }
}