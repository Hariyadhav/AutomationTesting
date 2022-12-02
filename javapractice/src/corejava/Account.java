package corejava;

public class Account { 
	int acc_no;
	String name;
	float amount;
	
	//Method to initialize object
	
	void insert(int a,String n,float amt){
		acc_no = a;
		name = n;
		amount = amt;
		
	}
	//deposit method
	void deposit(float amt) { 
		amount = amount+amt;
		System.out.println("Deposit Amount: " +amt);
		
	}
	//Withdraw Amount
	void withdraw(float amt){
		if(amount<amt) {
			System.out.println("Insufficient Balance ");
		}
		else {
			amount = amount -amt;
			System.out.println("Withdtaw: " +amt);
		}
		 
	 }
	//method to check the balance of Account
	void checkBalance(){
		System.out.println("Balance is: " +amount);
		
	}
	void display(){
		System.out.println(acc_no + " " + name + " "+ amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ob = new Account();
		ob.insert(123456, "KiranChowdhary", 200000);
		ob.display();
		ob.deposit(100000);
		ob.checkBalance();
		ob.withdraw(50000);
		ob.checkBalance();

	}

}
