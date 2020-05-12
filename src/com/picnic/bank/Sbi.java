package com.picnic.bank;



public class Sbi implements User,
 Bank {
	
	
int accountNUmber;
	
String name;
	
int accountBalance;
	
String password;
	
int dayCount = 0;

	
	public Sbi(int i, String string, int j, String string2) {
	// TODO Auto-generated constructor stub
}

	void SBI(int accountNUmber, String name, int accountBalance, String password){

		onBoardCustomer(accountNUmber, name, accountBalance, password);

	}

	public void SBI() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int getIntrestRate() {
	
	
		return 7;
	
}

	
@Override
	public int doDeposit(int amount) {

		this.accountBalance = this.accountBalance + amount;

			System.out.println("Deposit  amount "+ amount+ " Current Balance is "+this.accountBalance);

		return 0;

	}

	
@Override
	public int doWithrawal(int amount) {
	
	if(dayCount>3) {
			
System.out.println(this.name+",0nly 3 trasanstion can do ");
		
}
		
		
if(this.accountBalance >= amount) {
		
	dayCount += 1;
			
this.accountBalance = this.accountBalance - amount;
		
	System.out.println("withdrawal of amount Rs"+ amount+ " Balance is "+this.accountBalance);
		}else {
			System.out.println("Sorry!! insufficient bal");
		}
		return 0;
	}

	@Override
	public void onBoardCustomer(int accountNUmber, String name, int accountBalance, String password) {
		this.accountBalance=accountBalance;
		this.accountNUmber = accountNUmber;
		this.name= name;
		
	}

	public int getAccountNUmber() {
		return accountNUmber;
	}

	public void setAccountNUmber(int accountNUmber) {
		this.accountNUmber = accountNUmber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}



