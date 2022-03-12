package HackerRank;

import java.util.Scanner;

public class StdinII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stdIn();
	}

	public static void stdIn() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double b = sc.nextDouble();
		// That's because the Scanner.nextInt method does not read the newline character
		// in your input created by hitting "Enter," and so the call to Scanner.nextLine
		// returns after reading that newline.
		sc.nextLine();
		String c = sc.nextLine();
		sc.close();
		
		System.out.println("String: " + c);
		System.out.println("Double: " + b);
		System.out.println("Int: " + a);
	}
}
