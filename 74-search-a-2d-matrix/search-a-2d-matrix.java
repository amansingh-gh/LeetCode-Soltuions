class Solution {
   static boolean searchMatrix(int[][] matrix, int target){
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n= totalRow*totalCol;

        int st = 0;
        int end = n-1;

        while(st<=end){
            int mid = st+(end-st)/2;
            int rowIdx = mid/totalCol;
            int colIdx = mid%totalCol;

            if(matrix[rowIdx][colIdx]==target){
                return true;
            } else if (matrix[rowIdx][colIdx] > target) {
                end = mid-1;
            }else {
                st = mid+1;
            }
        }
        return false;
    }
}