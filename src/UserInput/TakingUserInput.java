package UserInput;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first no.");
//		float a = sc.nextFloat();
//		System.out.println("Enter second no.");
//		float b = sc.nextFloat();
//		float sum = a + b;
//		System.out.println(sum);
		cbsePercentage();
	}
	
	public static void cbsePercentage() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first subject marks.");
		float firstSub = sc.nextFloat();
		
		System.out.println("Enter second subject marks.");
		float secondSub = sc.nextFloat();
		
		System.out.println("Enter third subject marks.");
		float thirdSub = sc.nextFloat();
		
		float cbsePercentage = ((firstSub+secondSub+thirdSub)/300)*100;
		
		System.out.println("Your percentage is " + cbsePercentage);
	}

}
