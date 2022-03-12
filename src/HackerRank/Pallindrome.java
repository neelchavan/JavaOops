package HackerRank;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pallindrome();
	}

	public static void pallindrome() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String reverse = new StringBuffer(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
