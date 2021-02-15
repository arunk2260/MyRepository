package edu.vcentry.loops;

public class ForChallenge {

	public static void main(String[] args) {
	
		checkEven();

	}

	public static void checkEven(){

		for(int i = 20; i <= 30; i++){
			
			if(i % 2 == 0)
			
			{
				System.out.println(i);
			}
		}
		
	}
	
}