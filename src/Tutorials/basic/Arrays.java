package Tutorials.basic;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		int x; // creating that one box in memory that can store one int value
		int[] myArray;
		myArray = new int[4];
		
		x = 5;
		
		myArray[0] = x;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		
		for(int number : myArray) {
			System.out.println(number);
		}

	}
}
