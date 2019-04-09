package myPractice;

import java.util.Scanner;

public class TemperatureConverter {

	static float f = 0;
	static float c = 0;
	static int a;
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		    System.out.println("C를 F로 변경하려면 1을 누르세요. "
		    		+ "F를 C로 변경하려면 2를 누르세요");
		    a = scan.nextInt();
		    if (a == 1) 
		        convertCtoFAndPrint();
		    else
		        convertFtoCAndPrint();
		    scan.close();
	}

		public static void convertFtoCAndPrint() {
			System.out.println("Please enter degrees F");
		    f = scan.nextFloat();
		    c = (float)((5.0 / 9.0) * (f - 32.0));
		    System.out.println(f + " degrees F is " + c + 
		    		" degrees C.");
		
	}

		public static void convertCtoFAndPrint() {
		    System.out.println("Please enter degrees C");
		    c = scan.nextFloat();
		    f = (float)((c * (9.0 / 5.0)) + 32.0);
		    System.out.println(c + " degrees C is " + f + 
		    		" degrees F.");
		    scan.close();
	}
}


