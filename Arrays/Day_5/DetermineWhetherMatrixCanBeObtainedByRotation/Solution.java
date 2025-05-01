package Day_5.DetermineWhetherMatrixCanBeObtainedByRotation;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(isSame(mat, target))return true;
            mat = rotate(mat);
        }
        return false;
    }
    private boolean isSame(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != target[i][j])return false;
            }
        }
        return true;
    }

    private int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for(int i = 0 ; i < n; i++){
            for(int j=0; j < n; j++){
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }
}
