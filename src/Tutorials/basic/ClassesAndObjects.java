package Tutorials.basic;

public class ClassesAndObjects {
	public static void main(String[] args) {
		
		Person john = new Person("John");
		john.setAge(20);
		System.out.println(john.getName()); 
		john.setName("katie");
		System.out.println(john.getName());
		
//		Person bob  = new Person("Bob");
//		bob.setAge(30);
//		
//		john.sayHelloTo(bob);
//		
//		System.out.println(john.getName() + " is" +john.getAge() +  " years old");
//		System.out.println(bob.getName() + " is" +bob.getAge() +  " years old");
		
	}
}
