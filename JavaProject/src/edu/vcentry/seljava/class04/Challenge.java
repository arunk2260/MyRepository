package edu.vcentry.seljava.class04;

public class Challenge {

	public static void main(String[] args) {

		double myFirNum = 20.0;
		double mySecNum = 11.0;

		double Step1result = myFirNum * mySecNum;

		System.out.println("Step 1 Reult is :" + Step1result);

		System.out.println("----------------------");

		double step2Result = (Step1result % 20.0);

		System.out.println("Step 2 Result is :" + step2Result);

		System.out.println("----------------------");

		double step3Result = (Step1result % 40.0);

		System.out.println("Step 3 Result is :" + step3Result);

		System.out.println("----------------------");

		double step4Result = (step3Result + 30.0);

		System.out.println("Step 4 Result is : " + step3Result);

		System.out.println("----------------------");

		double resultFinal = ((step4Result + step3Result) * 10.0);

		System.out.println("Final Result =" + resultFinal);

	}

}
