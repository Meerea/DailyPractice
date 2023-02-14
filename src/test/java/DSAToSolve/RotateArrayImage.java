package DSAToSolve;

import org.junit.jupiter.api.Test;


/*TestData 1- matrix = {[1,2,3],[4,5,6],[7,8,9]]
TestData 1- matrix = {[11,2,4],[5,2,1],[1,1,1]

Pseudocode
1.Iterate array using 2 for loop taking i =0, j=i, until length of array
2.Swap the array elements
3.Repeat same iteration again
 */


public class RotateArrayImage {
    @Test
    public void test1(){
     int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    @Test
    public void test2(){
        int[][] matrix = {{11,2,4},{5,2,1},{1,1,1}};
        rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

    }
}

