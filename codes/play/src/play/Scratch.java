package play;

import java.util.Arrays;
import java.util.ArrayList;

public class Scratch {
	
	String appName;
	static ArrayList<Integer> doubleArray = new ArrayList<Integer>();
	
	public Scratch(String appName) {
		
		this.appName = appName;
	}
	
	public static int[] array = {1,2,3,4,5};
	
	//static method
	public static int Adder(int a, int b) {
		return a+b;
	}
	
	//non-static method
	public int Minus(int a, int b) {
		return a-b;
	}
	
	public static void main(String args[]) {
		//scratch myScratch = new scratch();
		System.out.println(Scratch.Adder(1, 3));
		//System.out.println(scratch.Minus(1, 3)); //this is impossible(not static method)
		Scratch Test = new Scratch("Calculator");
		System.out.println(Test.Minus(1, 3));
		System.out.println(Arrays.toString(array));
		doubleArray.add(1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		
	}
}
