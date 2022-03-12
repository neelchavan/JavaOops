
public class thisKeyword extends superKeyword {

	int a = 2;

	public void anotherA() {
		int a = 4;
		System.out.println(a);
		System.out.println(this.a);
		// use of super keyword
		System.out.println(super.a);

	}

	public void methodWithSameName() {
		System.out.println("i belong to thisKeyword class");
		super.methodWithSameName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyword td = new thisKeyword();
		td.anotherA();
		td.methodWithSameName();
	}

}
