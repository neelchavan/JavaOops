package AbstractClasses;

public abstract class parentClass {

	public void aircraftEngine() {
		System.out.println("This is engine method");
	}
	
	public void safetyGuidelines() {
		System.out.println("This is Safety guidelines method");
	}
	
	// This 'color()' method is abstract because it have no body
	// So if the class contains any abstract method the class automatically become abstract class
	abstract public void color();
}
