package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(!firstCalled) 
			throw new IllegalStateException("nextValue(): The firstValue() method has not been previously executed.");
		else{
			current = current * commonFactor; 
			return current;
		}
	}

	@Override
	public String toString() {
		return "Arith("+ (int)this.firstValue() + "," + (int)commonFactor +")";
	}
	
	@Override
	public double getTerm(int n) {
		double term = this.firstValue()*Math.pow(commonFactor, n-1);
		return term;
	}
	
	public boolean Equals(Progression p) {
			double first = p.firstValue();
			if (this.firstValue() == first 
					&& this.commonFactor == (first+p.nextValue())) {
				return true;
			}
			return false;
		}
	
}
