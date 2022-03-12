package HackerRank;

import java.util.Scanner;

public class JavaStaticInitializer {

	static Scanner sc = new Scanner(System.in);
	static int H = sc.nextInt();;
	static int B = sc.nextInt();
	static boolean flag = true;

	static {
		try {
			if (H <= 0 || B <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (flag) {
			int area = H * B;
			System.out.println(area);
		}
	}

}
