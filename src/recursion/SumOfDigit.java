package recursion;

class SumOfDigit {
  public static void main(String[] args) {
    SumOfDigit main = new SumOfDigit();
    int result = main.sumofDigits(56432);
    System.out.println(result);

  }
  public int sumofDigits(int n) {
    if (n==0 || n < 0) {
      return 0;
    }
    return n%10 + sumofDigits(n/10);
  }
}
