package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester3 {

	public static void main(String[] args) { 
		Progression p1;
		Progression p2;
		
		p1 = new Arithmetic(4, 7);
		p2 = new Arithmetic(4, 3);
		
		System.out.println("Testing addition of Arithemtic progressions:");
		System.out.println("Progression 1");
		p1.printAllTerms(10);
		System.out.println("Progression 2");
		p2.printAllTerms(10);
		System.out.println("Progression 1 + Progression 2");
		Progression p3 = p1.add(p2);
		p3.printAllTerms(10);
		
		System.out.println();
		
		System.out.println("Testing substraction of Arithemtic progression:");
		System.out.println("Progression 1");
		p1.printAllTerms(10);
		System.out.println("Progression 2");
		p2.printAllTerms(10);
		System.out.println("Progression 1 + Progression 2");
		p3 = p1.substract(p2);
		p3.printAllTerms(10);
		
		System.out.println();
		
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
		
		p2 = new Arithmetic(4, 7);
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
		
		System.out.println();
		
		
		p1 = new Geometric(3, 5);
		p2 = new Geometric(2, 8);
		
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
		
		p2 = new Geometric(3, 5);
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
	}
}
