package HackerRank;

import java.util.Scanner;

public class InttoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intToString();
	}

	public static void intToString() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		if (a >= -100 & a <= 100) {
			Integer.toString(a);
			System.out.println("Good Job");
		} else {
			System.out.println("Wrong answer");
		}
	}
}
