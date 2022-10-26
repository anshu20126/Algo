package array;

import java.util.Scanner;

public class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number");
		int a = sc.nextInt();
		System.out.print("enter second number");
		int b = sc.nextInt();
		System.out.println(add(a,b));
	}
	private static int add(int a,int b){
		return a-b;
	}
}