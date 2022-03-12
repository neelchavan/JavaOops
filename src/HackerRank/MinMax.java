package HackerRank;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 76, 55, 0, 66, 999 };
		int max = 0;
		int min = arr[0];

		for (int num : arr) {
			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
