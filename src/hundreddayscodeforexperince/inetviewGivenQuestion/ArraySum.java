package hundreddayscodeforexperince.inetviewGivenQuestion;

public class ArraySum {
    public static void main(String[] args) {
        int[][] arr = {{1, 9}, {3, 7}, {8, 9}};
        int targetSum = 10;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum == targetSum) {
                System.out.println("The sum of elements in array " + (i + 1) + " is " + targetSum);
            }
        }
    }
}

