package AbstractClasses;

public class childClass extends parentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass c = new childClass();
		
		c.aircraftEngine();
		c.safetyGuidelines();
		c.color();
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("This aircraft have plain white clour");
	}

}
