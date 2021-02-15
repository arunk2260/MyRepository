package edu.vcentry.loops;

public class ForChallenge2 {

	public static void main(String[] args) {

		checkEvenNumber();
	}

	public static void checkEvenNumber() {

		for (int i = 20; i <= 100; i++) {

			int count = 0;
			
			count = count + 1;

			if (i % 2 == 0)

			{

				System.out.println(i);
				count = count + 1;
				
				if(count > 5)
					break;
			}
			
			

		}

	}

}
