package edu.vcentry.loops;

public class ForChallenge3 {

	public static void main(String[] args) {

		checkOddOrEven();
	}

	public static void checkOddOrEven() {

		int n = 1000;

		int count = 0;

		for (int i = 0; i <= n; i++) {

			if (i >= 250 && i <= n) {

				if (i % 2 == 0) {

						count = count++;
						
						System.out.println("Even numbers are : " + i);
							
						}
					}
				}

			}

		}


