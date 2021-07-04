package Practice;

public class Singleton {

	// In OOP a singleton class is a class that can have only one object (or
	// instance of the class) at a time.
	// how to design singleton class in java:
	// 1. Make constructor as private
	// 2. write a static method that has return type object of singleton class (Lazy
	// Initialization)

	//diff bw normal class and singleton class:
	//for normalclass we use constructor where as for singleton class we use getInstance() method for instantiation.
	
	private static Singleton singleton_instance = null;

	public String str;

	private Singleton() {
		str = "Hey, I am using singleton class pattern";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		System.out.println("****************************");

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
