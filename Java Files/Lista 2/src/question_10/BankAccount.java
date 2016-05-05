package question_10;

public class BankAccount extends SetupBA {
	
	
	
public void draft(double value){
	
	if (value < getBalance()){
		System.out.println("Draft accepted");
		
		double sub = getBalance() - value;
		
		setBalance(sub);
		
	}
	
	else 
		System.out.println("Draft denied. Insufficient funds.");
	
}
	
	
	
public void deposit(double value){
	
	System.out.println("Previous balance: " +getBalance());	
	
	double sum = getBalance() + value;
	setBalance(sum);
	
	System.out.println("New balance: "+getBalance());
	
	
	
}

	
	
	
	
	
	
}
