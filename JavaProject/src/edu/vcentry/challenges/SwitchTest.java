package edu.vcentry.challenges;

public class SwitchTest {

	public static void main(String[] args) {

		// char myGrade = 'C';
		// int myMark = checkGrade(myGrade);
		// System.out.println("My Grade is : " + myMark);

		char myMarks = checkGrade(90);
		System.out.println(myMarks);
		
		 
	}

	/*
	 * public static int checkGrade(char grade) {
	 * 
	 * int marks; switch (grade) { case 'A': marks = 90; break; case 'B': marks
	 * = 80; break; case 'C': marks = 70; break; case 'D': marks = 60; break;
	 * case 'E': marks = 50; break;
	 * 
	 * default: return 0; } return marks;
	 * 
	 * }
	 */

	public static char checkGrade(int marks) {

		char grade;
		switch (marks) {
		case 90:
			grade = 'A';
			break;
		case 80:
			grade = 'B';
			break;

		case 70:
			grade = 'C';
			break;
		case 60:
			grade = 'D';
			break;

		default:
			return 'E';
		}
		return grade;

	}

}
