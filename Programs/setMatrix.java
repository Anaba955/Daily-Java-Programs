/*Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.*/


class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] zeroMatrix = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                    zeroMatrix[i][j] = matrix[i][j];
            }
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == 0) {
                    for(int col=0; col<c;col++){
                        zeroMatrix[i][col] = 0;
                    }
                    for(int row=0; row < r; row++){
                        zeroMatrix[row][j] = 0;
                    }
                }
            } 
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = zeroMatrix[i][j] ;
            }
        }
    }
}
