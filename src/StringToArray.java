import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "neelchavan";
		char[] chArr = str.toCharArray();
		int strLength = str.length();
		System.out.println(strLength);
		String[] arr = {"m","n"};
		System.out.println(Arrays.toString(arr));
		
		for(char ch: chArr) {
			System.out.println(ch);
		}
	}

}
