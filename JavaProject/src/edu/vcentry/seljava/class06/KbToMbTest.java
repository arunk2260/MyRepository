package edu.vcentry.seljava.class06;

public class KbToMbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(kbToMb(5000));

	}

	// 1 MB = 1024 KB
	
	public static String kbToMb(int myKb) {

		int myMb = myKb / 1024;
		int remainingKb = myKb % 1024;
		String result = myMb + "MB " + remainingKb + "KB";
		return result;

	}

}
