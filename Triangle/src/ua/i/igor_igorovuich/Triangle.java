package ua.i.igor_igorovuich;

class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle() {
		super();
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double square() {
		double p = (this.sideA + this.sideB + this.sideC) / 2;
		if ((this.sideA > this.sideB + this.sideC) || (this.sideB > this.sideA + this.sideC)
				|| (this.sideC > this.sideA + this.sideB)) {
			System.out.println("Triangle doesn't exist");
			return 0.0;
		} else {
			double s = Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
			return s;
		}
	}

	@Override
	public String toString() {
		return "Triangle [sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC + ", square = "
				+ square() + "]";
	}

}
