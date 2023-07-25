package hundreddayscodeforexperince.code;

public class RotateArray180 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            rotateMatrix180(matrix);

            // Print the rotated matrix
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        public static void rotateMatrix180(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            // Swap elements horizontally
            for (int i = 0; i < rows / 2; i++) {
                for (int j = 0; j < cols; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[rows - 1 - i][j];
                    matrix[rows - 1 - i][j] = temp;
                }
            }

            // Swap elements diagonally
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }


   /* Explanation:

            The rotateMatrix180 method takes a 2D matrix as input and rotates it by 180 degrees in-place.
            The first loop swaps elements horizontally by exchanging matrix[i][j] with matrix[rows - 1 - i][j]. This effectively reverses the rows of the matrix.
            The second loop swaps elements diagonally across the main diagonal. This is achieved by exchanging matrix[i][j] with matrix[j][i].
            By performing these two swaps, the matrix is rotated by 180 degrees without using any extra space. The final rotated matrix is printed in the main method.


*/

