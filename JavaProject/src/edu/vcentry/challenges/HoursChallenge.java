package edu.vcentry.challenges;

public class HoursChallenge {

	public static void main(String[] args) {

		int result = getminutes(24);

		System.out.println(result);

	}

	public static int getminutes(int hours) {

		int minutes = hours * 60;

		return minutes;

	}

}
