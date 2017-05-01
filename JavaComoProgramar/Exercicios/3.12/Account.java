public class Account {
	private double balance;
	public Account(double initialBalance) {
		if (initialBalance > 0.0) {
			balance = initialBalance;
		}
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double debitAmount) {
		if (debitAmount <= balance) {
			balance = balance - debitAmount;	
		} else {
			System.out.printf("Operação cancelada! Valor a debitar maior que o valor na conta...");
		}		
	}

	public double getBalance() {
		return balance;
	}

}
