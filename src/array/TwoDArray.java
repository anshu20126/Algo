package array;

/*2D Arrays
        Given 2D array calculate the sum of diagonal elements.
        Example
        myArray2D= {{1,2,3},{4,5,6},{7,8,9}};

        sumDiagonal(myArray2D) # 15*/
public class TwoDArray {
    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] myArray2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumDiagonal(myArray2D));
    }
}
