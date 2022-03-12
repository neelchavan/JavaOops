package javascopes;

public class JavaScope extends JavaScope2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childMethod("hello");
		childMethod2(2);
		JavaScope js = new JavaScope();
		js.printA();
	}

	int a = 2;

	public void printA() {
		int a = 3;
		System.out.println(this.a);
	}

	public void newMethod() {
		System.out.println("I am the new method");
	}
}
