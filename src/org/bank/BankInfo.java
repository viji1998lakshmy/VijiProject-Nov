package org.bank;
//child
public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("Type:Saving Account");

	}
	private void fixed() {
		System.out.println("Type:Fixed Account");

	}
    public static void main(String[] args) {
		
    	BankInfo b=new BankInfo();
    	b.deposit();
    	b.fixed();
    	b.saving();
    	
	}
}
