package orderedStructures;

import java.util.ArrayList;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable{
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
		firstCalled = false;
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(!firstCalled) 
			throw new IllegalStateException("nextValue(): The firstValue() method has not been previously executed.");
		else{
			current = current + commonDifference;
			return current;
		}
	}
	
	@Override
	public String toString() {
		return "Arith("+ (int)this.firstValue() + "," + (int)commonDifference+")";
	}
	
	@Override
	public double getTerm(int n) {
		double term = this.firstValue() + commonDifference*(n-1);
		return term;
	}
	
	@Override
	public boolean equals(Progression p) {
		double first = p.firstValue();
		if (this.firstValue()==first 
				&& this.commonDifference==(p.nextValue()-first)) {
			return true;
		}
		else return false;
	}
	
	public Progression add(Progression p) {
	//can't figure it out
	}
	
}
