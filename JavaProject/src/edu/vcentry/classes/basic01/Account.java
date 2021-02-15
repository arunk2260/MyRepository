package edu.vcentry.classes.basic01;

public class Account {

	private String accountNumber;
	private String customerName;
	private String mobileNumber;
	private double balance;

	public Account() {
		System.out.println("I am in constructor");
	}

	/**
	 * @param accountNumber
	 * @param customerName
	 * @param mobileNumber
	 * @param balance
	 */
	public Account(String accountNumber, String customerName, String mobileNumber, double balance) {

		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setBalance(double amount) {
		balance += amount;
	}

	public double getbalance() {
		return balance;
	}

	public void getWithdrawal(double amount) {
		if ((balance - amount) < 0) {
			System.out.println("insufficient balance");
		} else {

			System.out.println("New Balance is:" + "" + balance);
		}
	}

}
