package common;

import java.util.Scanner;

public class LargestNumber {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Two Numbers: ");
      int x = scan.nextInt();
      int y = scan.nextInt();
      
      System.out.println(LargestOfTwo(x, y));
   }
   public static int LargestOfTwo(int a, int b) {
      return (a>b) ? a:b;
   }
}