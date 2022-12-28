package Tutorials.basic;

public class Methods {
	public static void main(String[] args) {
		sayBuna();
		sayBunaLa("Dragos");
		
		int x = return10();
		System.out.println(x);
		
		int result = square (return10());
		
		System.out.println(result);
		
		
		
		
	}
	
	static int square(int x) {
		
		//int a = x*x;
				return x*x;
	}
	
	//returns an int type with the value 
	static int return10() {
		return 10;
	}
	
	//takes in data and works with it
	static void sayBunaLa (String name) {
		System.out.println("Buna seara, " + name);
	}
	
	// says simple hello
	static void sayBuna () {
		
		System.out.println("Buna seara");
	}

}
