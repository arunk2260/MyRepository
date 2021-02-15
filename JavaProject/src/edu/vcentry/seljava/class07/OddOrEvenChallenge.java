package edu.vcentry.seljava.class07;

public class OddOrEvenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String result = iSEvenOrOdd(23);
		
//		System.out.println(result);
		
		boolean result = iSEvenOrOdd(54);
		System.out.println("Is number is even? " + result);
		

	}

/*	public static String iSEvenOrOdd(final int num) {

		String type = "odd";
		
		if (num % 2 == 0) {

			type = "even";

			// System.out.println("Given number is even");

		}
			return type;

		}*/
	
	
	public static boolean iSEvenOrOdd(final int num) {
		
		if(num % 2 == 0){
			return true;
		}
		return false;
	}
	
	

	}
