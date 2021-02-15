package edu.vcentry.classes.basic01;

public class BankTransaction {

	public static void main(String[] args) {

		Account name = new Account();
		name.setCustomerName("ABC");
		
		String custName = name.getCustomerName();

		System.out.println("Account number is :" + "" +custName);
		
//		System.out.println(String.format("Account number is :%s", custName));
		
		name.setBalance(1000d);		
		double bal = name.getbalance();
		System.out.println(bal);
		
		name.getWithdrawal(1000d);
		

		
		
	}

}
