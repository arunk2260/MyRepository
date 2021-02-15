package edu.vcentry.challenges;

public class PrimeChallenge {

	public static void main(String[] args) {

		String result = printPrimeNumber(29);

		System.out.println(result);

	}

	public static String printPrimeNumber(int myNum) {

		int n = 100;

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (myNum % i == 0) {

				return "Number is not Prime";
			}

		}

		return "Number is prime";

	}

}
