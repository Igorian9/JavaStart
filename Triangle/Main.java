package ua.i.igor_igorovuich;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 2;
		double b = 3;
		double c = 4;
		double p;
		p = (a + b + c) / 2;

		double s;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Square of triangle: " + s);

	}

}
