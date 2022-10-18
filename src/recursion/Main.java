package recursion;

class DecimalToBinary {
  public static void main(String[] args) {
    int result = decimalToBinary(2);
    System.out.println(result);
  }
  public static int decimalToBinary(int n) {
    if (n==0) {
      return 0;
    }
    return n%2 + 10*decimalToBinary(n/2);
  }
}
