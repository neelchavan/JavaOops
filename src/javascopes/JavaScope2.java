package javascopes;

public class JavaScope2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScope js = new JavaScope();
		js.newMethod();
	}

	public static void childMethod(String str) {
		System.out.println(str);
	}

	public static void childMethod2(int s) {
		System.out.println(s);
	}
}
