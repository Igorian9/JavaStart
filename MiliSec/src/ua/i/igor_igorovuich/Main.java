package ua.i.igor_igorovuich;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		Date now = cl.getTime();
		System.out.println(now);
		cl.add(Calendar.MONTH, -1);
		Date past = cl.getTime();
		System.out.println(past);
		long result = now.getTime() - past.getTime();
		System.out.println(result);
	}


}
