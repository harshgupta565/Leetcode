class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length * grid[0].length;
        int[] prefix = new int[m];
        int[] suffix = new int[m];
        int t = 0;

        // Compute prefix product
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    prefix[t++] = grid[i][j];
                } else {
                    prefix[t] = (int)((long)grid[i][j] * prefix[t - 1] % 12345);
                    t++;
                }
            }
        }

        // Compute suffix product
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (i == grid.length - 1 && j == grid[0].length - 1) {
                    suffix[--t] = grid[i][j];
                } else {
                    t--;
                    suffix[t] = (int)((long)grid[i][j] * suffix[t + 1] % 12345);
                }
            }
        }

        // Build result in-place
        t = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++, t++) {
                if (t == 0) {
                    grid[i][j] = suffix[t + 1];
                } else if (t == prefix.length - 1) {
                    grid[i][j] = prefix[t - 1];
                } else {
                    grid[i][j] = (int)(((long)prefix[t - 1] * suffix[t + 1]) % 12345);
                }
                grid[i][j] = grid[i][j] % 12345;
            }
        }

        return grid;
    }
}