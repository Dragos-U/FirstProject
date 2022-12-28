package Tutorials.basic;

public class Scope {
	
	// class variable
	static int x;
	
	public static void main(String[] args) {
		x = 5;
		System.out.println(x);
		doSomething();
		System.out.println(x);
	}
	
	static void doSomething() {
		x = 10;
	}
	
	static void soSomethingLocally () {
		// because y is declared inside of this method, is local to this method, in other words
		//no other method has access to y
		
		// local variable
		int y = 100;
	}
}
