package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p; 
		
		
		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci(); 
		p.nextValue();	 //For testing that it doesn't run before firstValue() method is executed
		p.printAllTerms(20);
		
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3); 
		//p.nextValue();  //For testing that it doesn't run before firstValue() method is executed
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3); 
		//p.nextValue(); //For testing that it doesn't run before firstValue() method is executed
		p.printAllTerms(20);
		
		
	}

}
