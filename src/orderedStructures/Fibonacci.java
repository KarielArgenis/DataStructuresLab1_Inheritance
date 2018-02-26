package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
		firstCalled = false;
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException {
		if(!firstCalled) 
			throw new IllegalStateException("nextValue(): The firstValue() method has not been previously executed.");
		else {
			double temp = current;
			current = current + prev;
			prev = temp;
			return current;
		}
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		firstCalled=true;
		return value; 
	}

}
