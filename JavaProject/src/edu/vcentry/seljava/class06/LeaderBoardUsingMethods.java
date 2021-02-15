package edu.vcentry.seljava.class06;

public class LeaderBoardUsingMethods {

	public static void main(String[] args) {

		findPosition("Arun", 800);
		//findPosition();
	}

	public static void findPosition(String playerName, int score) {

		if (score >= 1000) {
			System.out.println(playerName + " is holding position 1");
		} else if (score >= 500) {
			System.out.println(playerName + " is holding position 2");
		} else if (score >= 100) {
			System.out.println(playerName + " is holding position 3");
		} else {
			System.out.println(playerName + " is holding position 4");
		}

	}

/*	public static void findPosition() {

		String playerName = "kumar";
		int score = 10;

		if (score >= 1000) {
			System.out.println(playerName + " is holding position 1");
		} else if (score >= 500) {
			System.out.println(playerName + " is holding position 2");
		} else if (score >= 100) {
			System.out.println(playerName + " is holding position 3");
		} else {
			System.out.println(playerName + " is holding position 4");
		}

	}*/

}
