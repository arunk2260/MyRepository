package edu.vcentry.seljava.class07;

public class PrimeNumberChallenge {

	public static void main(String[] args) {
		
		int myNum = 3;
		
		System.out.println("Is my Number " + myNum + "Prime ? : " + checkPrimeNumber(3));
		
	}

	public static boolean checkPrimeNumber(int myNum) {

		boolean isPrime = true;
		
		int n = 10;

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (myNum % i == 0) {
				isPrime = false;
				break;
				

			}

		}
		
		return isPrime;
	}

}
