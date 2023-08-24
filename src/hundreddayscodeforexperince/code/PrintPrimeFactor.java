package hundreddayscodeforexperince.code;

import java.util.ArrayList;
import java.util.List;
public class PrintPrimeFactor {
    public static void main(String[] args) {
        int n = 36;
        List<Integer> factors = findFactors(n);

        List<Integer> factors1 = findPrimeFactors(factors);

        System.out.println("Factors of " + n + ": " + factors1);
    }

    private static List<Integer> findFactors(int n) {
        List<Integer> factor = new ArrayList<>();
        for (int i = 2; i <=n; i++) {
            if (n%i==0){
                factor.add(i);

            }
        }
        return factor;
    }
    private static List<Integer> findPrimeFactors(List<Integer> factors) {
        List<Integer> primeFactor = new ArrayList<>();

        for (int i : factors){
            if (isPrime(i)){
                primeFactor.add(i);
            }
        }



        return primeFactor;
    }

    private static boolean isPrime(int i) {
        if (i<=1){
            return false;
        }
        for (int j = 2; j <=Math.sqrt(i) ; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
}
