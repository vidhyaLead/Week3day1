package org.system;

public class Axisbank extends BankInfo{
	
	public void deposit(int a) {
		
	a=12;
		System.out.println("Axis bank rate of interest is high in market" + a+"%");
	}
	
	public void deposit() {
		
		
			System.out.println("Axis bank rate of interest is high in market%");
		}

	public static void main(String[] args) {
		
		Axisbank a1 = new Axisbank();
		a1.deposit();
	a1.deposit(12);
	a1.fixed();
	a1.saving();
		
//Why I couldn't use the default and Protect in the same package 
	}

}
