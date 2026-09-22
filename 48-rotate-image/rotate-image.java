class Solution {
       public void rotate(int[][] matrix) {

            int[][] newArr = new int[matrix[0].length][matrix.length];

            int n = matrix.length;
            // step 1: transpose matrix
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    newArr[col][row] = matrix[row][col];
                }
            }

            // step2: reverse the row matrix
            for (int row = 0; row < n; row++) {
                int startCol = 0;
                int endCol = n-1;
                while (startCol < endCol) {
                    int temp = newArr[row][startCol];
                    newArr[row][startCol] = newArr[row][endCol];
                    newArr[row][endCol] = temp;
                    startCol++;
                    endCol--;
                }
            }
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    matrix[row][col] = newArr[row][col];
                }
            }
        }
    }