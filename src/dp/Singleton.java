package dp;

public class Singleton {

	// The singleton pattern is a design pattern that restricts the instantiation of
	// a class to one object
	//private constructor
	private Singleton() {

	}

	public static Singleton singleton = new Singleton();
	public String str;

	public static Singleton getSingleInstance() {
		return singleton;
	}

}
