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

	public double square(double sideA, double sideB, double sideC) {
		double p = (sideA + sideB + sideC) / 2;
		if ((sideA > sideB + sideC) || (sideB > sideA + sideC) || (sideC > sideA + sideB)) {
			System.out.println("Triangle doesn't exist");
			return 0.0;
		} else {
			double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
			return s;
		}
	}

	@Override
	public String toString() {
		return "Triangle [sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC + ", square = "
				+ square(this.sideA, this.sideB, this.sideC) + "]";
	}

}
