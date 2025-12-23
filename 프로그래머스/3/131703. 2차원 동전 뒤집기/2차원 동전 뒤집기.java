class Solution {
    public int solution(int[][] beginning, int[][] target) {
        int rows = beginning.length;
        int cols = beginning[0].length;
        int minFlips = Integer.MAX_VALUE;

        for (int rowMask = 0; rowMask < (1 << rows); rowMask++) {
            int[][] current = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    current[i][j] = beginning[i][j];
                    if ((rowMask & (1 << i)) != 0) {
                        current[i][j] = 1 - current[i][j];
                    }
                }
            }
            
            int colFlips = 0;
            boolean[] flipCol = new boolean[cols];
            
            for (int j = 0; j < cols; j++) {
                if (current[0][j] != target[0][j]) {
                    flipCol[j] = true;
                    colFlips++;
                }
            }
            
            boolean isValid = true;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int value = current[i][j];
                    if (flipCol[j]) {
                        value = 1 - value;
                    }
                    
                    if (value != target[i][j]) {
                        isValid = false;
                        break;
                    }
                }
                if (!isValid) break;
            }
            
            if (isValid) {
                int rowFlips = Integer.bitCount(rowMask);
                minFlips = Math.min(minFlips, rowFlips + colFlips);
            }
        }
        
        return minFlips == Integer.MAX_VALUE ? -1 : minFlips;
    }
}