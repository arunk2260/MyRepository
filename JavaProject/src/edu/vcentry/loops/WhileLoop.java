package edu.vcentry.loops;

public class WhileLoop {

	public static void main(String[] args) {

		printHelloSeries(5);

	}

	public static void printHelloSeries(int noOfTimes) {

		int i = 0;
		while (i < 10) {
			
			// while(true) ----> infinite loop
			System.out.println("Hello");
			i = i + 1;
		}
	}

}
