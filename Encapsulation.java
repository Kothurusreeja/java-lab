package programs;
class Bank{
	private String name;
	private double balance;
public Bank(String name,double balance)
{
	this.name=name;
	this.balance=balance;
}
public String getname() {
	return name;
	
}
public double getbalance() {
	return balance;
}
public void deposit(double amount) {
	if(amount>0)
	{
		this.balance=balance+amount;
		System.out.println("the updated balance"+balance);
		
	}
	else
	{
		System.out.println("invalid as there is no sufficient amount to be deposited");
	}
	
}
public void withdraw(double amount) {
	if(balance>=amount)
	{
		this.balance=balance-amount;
		System.out.println("balance after withdrawl"+balance);
		
	}
	else
	{
		System.out.println("no sufficient money");
	}
}
}
public class Encapsulation {
	public static void main(String[] args) {
      Bank a1=new Bank("sreeja",600);
      	System.out.println("account holder name is"+a1.getname());
      	System.out.println("the balance is"+ a1.getbalance());
      	a1.deposit(400);
      	a1.withdraw(200);
      	     
		
	}
}
