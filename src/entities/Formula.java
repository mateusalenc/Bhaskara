package entities;

import entities.exception.DomainException;

public class Formula {
	private Double delta;
	private Double b;
	private Double a;
	private Double c;
	private Double x;
	public Formula(Double a, Double b, Double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Double getDelta() {
		return delta;
	}

	public void setDelta(Double delta) {
		this.delta = delta;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}
	
	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public void formula1() {
		System.out.print("Delta: ");
		 System.out.println(delta = Math.pow(b, 2) - 4 * a * c);
		if(delta > 0) {
			x = (-b + Math.sqrt(delta))/2/a;
			System.out.printf("X 1: %.0f%n",x);
			x = (-b - Math.sqrt(delta))/2/a;
			System.out.printf("X 2: %.0f%n",x);
		}else {
			throw new DomainException("The Delta is not positive");
		}
		 
		 
	}
}


