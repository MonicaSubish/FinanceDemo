package com.fin;

public class Bank {
	private void hdfc() {
		System.out.println(" HDFC Bank  headquartered in Mumbai");
	}

	private void canara() {
		System.out.println("Canara Bank headquartered in Bengaluru ");
	}

	private void idbi() {
		System.out.println("IDBI Bank headquartered in Mumbai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.hdfc();
		bank.canara();
		bank.idbi();
	}

}
