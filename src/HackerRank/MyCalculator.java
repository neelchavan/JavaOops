package HackerRank;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator mc = new MyCalculator();
		mc.divisor_sum(0);
	}

	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				result += i;
			}
		}
		System.out.println(result);
		return result;
	}

}
