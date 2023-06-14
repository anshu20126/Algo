package hundreddayscodeforexperince.code;
//https://www.geeksforgeeks.org/find-the-smallest-number-whose-sum-of-digits-is-n/
public class FindSmallestNumberWhoseSumOfDigitIsN {
    public static int solution(int N) {
        int sumOfDigitsN = getSumOfDigit(N);
        for (int i = N+1;; i++) {
            if (getSumOfDigit(i)==2*sumOfDigitsN){
                return i;
            }
        }
    }
    private static int getSumOfDigit(int n) {
        int sum =0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int N =14;
       System.out.println(solution(N));
    }
}

