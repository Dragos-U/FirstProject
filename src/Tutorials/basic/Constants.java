package Tutorials.basic;


public class Constants {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600; 
	public static final Person  P1 = new Person("");
	
	public static final int NUM_ENEMIES = 5;
	
	public static void main(String[] args) {
		// constants never change once a vale is assigned
		// usually static
		// by convention , constants are upper case
		// declare constants by using the "final" modifier.
		// cosntants can be public because there s no harm in accesing variables directly if you can't alter them
		
		System.out.println(WIDTH);
		System.out.println(HEIGHT);
	}
}
