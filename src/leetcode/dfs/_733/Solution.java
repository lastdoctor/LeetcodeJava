package leetcode.dfs._733;

class Solution {
    private void dfs(int[][] image, int row, int col, int color, int num) {
        if (row >= image.length ||
                col >= image[0].length ||
                row < 0 ||
                col < 0 ||
                image[row][col] != num
        ) return;

        image[row][col] = color;

        dfs(image, row + 1, col, color, num);
        dfs(image, row - 1, col, color, num);
        dfs(image, row, col + 1, color, num);
        dfs(image, row, col - 1, color, num);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int num = image[sr][sc];
        if (image[sr][sc] == color) return image;
        dfs(image, sr, sc, color, num);

        return image;
    }
}
