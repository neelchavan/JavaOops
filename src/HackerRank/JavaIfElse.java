package HackerRank;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaIfElse();
	}
	
	public static void javaIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		sc.close();
		if (n % 2 == 0 & (n>=2 & n<=5)) {
			System.out.println("Not Weird");
		}
		else if (n % 2 == 0 & n > 20) {
			System.out.println("Not Weird");
		}
		else {
			System.out.println("Weird");
		}
	}

}
