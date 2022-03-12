package Inheritance;

public class childClass extends parentClass1 {

	public void firstMethod() {
		super.firstMethod();
		System.out.println("i am firstMethod from child class");
	}

	public static void staticMethod() {
		System.out.println("I am the static method from child class");
	}

	public void secondMethod() {
		firstMethod();
		super.staticMethod();
		staticMethod();
		System.out.println("i am second method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass c = new childClass();
		c.secondMethod();
	}

}
