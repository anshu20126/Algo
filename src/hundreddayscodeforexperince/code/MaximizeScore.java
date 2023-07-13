package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class MaximizeScore {
    public static int maximizeScore(int[] arr, int k) {
        int n = arr.length;
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // Compute the prefix sum of the array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        // Calculate the maximum score
        int maxScore = 0;
        for (int i = 0; i < k; i++) {
            maxScore += arr[i];
        }
        maxScore += prefixSum[n - 1] - prefixSum[n - k - 1];
        
        return maxScore;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int k = 3;
        int maxScore = maximizeScore(arr, k);
        System.out.println("Maximum score: " + maxScore);
    }
}
