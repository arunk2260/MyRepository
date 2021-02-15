package edu.vcentry.challenges;

public class PrimeChallenge2 {

	public static void main(String[] args) {

		checkPrimeNumber(25);

	}

	public static void checkPrimeNumber(int myNum) {

		int n = 30;

		for (int i = 2; i <= n; i++) {
			
			if((i >= 20) && (i<=30)) {
				
				if(myNum % i == 0){
					
					System.out.println(myNum);
					myNum = myNum + 1;
					
				}else
					break;
			}

		}
		

	}

}
