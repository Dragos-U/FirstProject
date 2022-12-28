package Tutorials.basic;

public class ReferenceAndValueTypes {
	public static void main(String[] args) {
		
		int x = 5;
		addOneTo(x);
		
		System.out.println(x); // we re passing a value type, so we pass a copy of the value of x, which is 5
		
		Person john; 
		john = new Person("John"); //  we are creating a new person object , and assigning john to refer to it
		
		john.setAge(20);
		
		celebrateBirthday(john); // we are pasing that reference to amethod, so the method can use the reference to manipulate the value
		
		System.out.println(john.getAge());
		
		
		
	}
	
	private static void celebrateBirthday(Person john) {
		// TODO Auto-generated method stub
		john.setAge(john.getAge()+1);
	} 
 // we manipulate a copy of the value passed
	static void addOneTo(int number) {
		number = number + 1;
	}
}
