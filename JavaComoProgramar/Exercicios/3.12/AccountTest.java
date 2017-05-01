import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);

		System.out.printf("valor na conta: $%.2f \n", account1.getBalance());
		System.out.printf("valor na conta: $%.2f \n", account2.getBalance());

		Scanner input = new Scanner(System.in);
		double depositAmount;
		double debitAmount;

		System.out.print("Entre com a quantia para depositar na conta 1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nAdicionando %.2f para a conta 1", depositAmount);
		account1.credit(depositAmount);

		System.out.printf("Valor na conta 1: $%.2f \n", account1.getBalance());
		System.out.printf("Valor na conta 2: $%.2f \n\n", account2.getBalance());

		System.out.print("Entre com a quantia para depositar na conta 2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nAdicionando %.2f para a conta 2", depositAmount);
		account2.credit(depositAmount);

		System.out.printf("Valor na conta 1: $%.2f \n", account1.getBalance());
		System.out.printf("Valor na conta 2: $%.2f \n\n", account2.getBalance());

		System.out.print("Entre com a quantia para retirar na conta 1: ");
		debitAmount = input.nextDouble();
		System.out.printf("\nRetirado %.2f para a conta 1", debitAmount);
		account1.debit(debitAmount);

		System.out.print("Entre com a quantia para retirar na conta 2: ");
		debitAmount = input.nextDouble();
		System.out.printf("\nRetirado %.2f para a conta 2", debitAmount);
		account2.debit(debitAmount);
		
		System.out.printf("Valor na conta 1: $%.2f \n", account1.getBalance());
		System.out.printf("Valor na conta 2: $%.2f \n\n", account2.getBalance());

				

	}
}