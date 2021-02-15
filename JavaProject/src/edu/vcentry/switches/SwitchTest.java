package edu.vcentry.switches;

public class SwitchTest {

	public static void main(String[] args) {
		
		String month = "Jan";
		System.out.println("No of days in " + month + "" + " "+ findDaysInaMonthUsingIf("Jan"));

		

	}

	public static int findDaysInaMonthUsingIf(String month) {
		if (month.equals("Jan") || (month.equals("Mar"))) {
			return 31;
		} else if (month.equals("Feb")) {
			return 28;
		}
		return 30;
	}

	public static int findDaysInaMonthUsingSwitch(String month) {

		int days = 0;
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "July":
		case "Aug":
		case "Oct":
		case "Dec":

			days = 31;
			break;
		case "Feb":
			days = 28;
			break;

		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			days = 30;
			break;
		}
		return days;
	}

}
