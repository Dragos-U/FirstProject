package Tutorials.basic;//package tutorials.basic;

public class loops {
	public static void main(String[] args) {
		
	forLoop();
	
	}
		
	static void whileLoop() {
		int x = 0;
		
		while (x < 10) {
					
			x = x + 1;
			System.out.println(x);
		}
	}
	
	static void forLoop() {
		for (int counter = 0; counter < 10; counter = counter +1) {
			System.out.println(counter);
		}
	}
}
