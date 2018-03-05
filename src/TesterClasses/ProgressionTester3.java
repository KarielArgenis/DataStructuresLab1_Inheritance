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
		
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
		
		p2 = new Arithmetic(4, 7);
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));

		p1 = new Geometric(3, 5);
		p2 = new Geometric(2, 8);
		
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
		
		p2 = new Geometric(3, 5);
		System.out.println("Are "+p1+" and "+p2+" equal?");
		System.out.println(p1.equals(p2));
	}
}
