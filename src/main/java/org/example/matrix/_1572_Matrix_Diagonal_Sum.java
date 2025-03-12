package org.example.matrix;

public class _1572_Matrix_Diagonal_Sum {

    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }

//    Example 1:
//    Input: mat =[[1,2,3],
//                 [4,5,6],
//                 [7,8,9]]
//    Output: 25
//    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//    Notice that element mat[1][1] = 5 is counted only once.

//    Example 2:
//    Input: mat = [[1,1,1,1],
//                  [1,1,1,1],
//                  [1,1,1,1],
//                  [1,1,1,1]]
//    Output: 8

//    Example 3:
//    Input: mat = [[5]]
//    Output: 5
}
