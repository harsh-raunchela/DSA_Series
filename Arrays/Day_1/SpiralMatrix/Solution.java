package Day_1.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top =0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){

            //left to right
            for(int col = left; col <= right; col++){
                result.add(matrix[top][col]);
            }
            top++;

            //top to bottom
            for(int row = top; row <= bottom; row++){
                result.add(matrix[row][right]);
            }
            right--;

            //right to left
            if(top <= bottom){
                for(int col = right; col >= left; col--){
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            //bottom to right
            if(left <= right){
                for(int row = bottom; row >= top; row--){
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }
        return result;
    }
}
