package recursion;

public class ProductOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int N=a.length;
        System.out.println(productOfArray(a,N));
    }

    private static int productOfArray(int A[], int N) {
        if (N <= 0)
            return 1;
        return (productOfArray(A, N - 1) * A[N - 1]);
    }
}
