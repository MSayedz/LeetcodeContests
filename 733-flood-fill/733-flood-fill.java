class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (color != originalColor) 
            dfs(image, sr, sc, originalColor, color);
        
        return image;
    }
    
    static void dfs(int[][] image, int r, int c, int originalColor, int color) {
        if(r<0 || c<0 || r>image.length-1 || c>image[0].length-1 
           || image[r][c] != originalColor)
            return;
        image[r][c] = color;
        dfs(image, r+1, c, originalColor, color);
        dfs(image, r-1, c, originalColor, color);
        dfs(image, r, c+1, originalColor, color);
        dfs(image, r, c-1, originalColor, color);
    }
}