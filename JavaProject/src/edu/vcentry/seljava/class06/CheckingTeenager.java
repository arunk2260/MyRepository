package edu.vcentry.seljava.class06;

public class CheckingTeenager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ageCheck(23, 19, 87);

	}

	public static void ageCheck(int age1, int age2, int age3) {

		if ((age1 >= 13) && (age1 <= 19) || (age2 >= 13) && (age2 <= 19) || (age3 >= 13) && (age3 <= 19)) {
			System.out.println("We have a teenager in the group");

		} else {
			System.out.println("There is no teenager in the group");
		}

	}

}
