import java.util.Scanner;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		invoice.setNumero(1);
		invoice.setQuantidade(-2);
		invoice.setValorUnitario(-12.50);
		invoice.setDescricao("Mouse");

		int numero = invoice.getNumero();
		int quantidade = invoice.getQuantidade();
		double valorUnitario = invoice.getValorUnitario();
		String descricao = invoice.getDescricao();

		double buyValue = invoice.getInvoiceAmount();
		System.out.printf("Número do Item: " + invoice.getNumero() + "\n");
		System.out.printf("Quantidade: " + invoice.getQuantidade() + "\n");
		System.out.printf("Descrição: " + invoice.getDescricao() + "\n");
		System.out.printf("Valor unitário: $%.2f", invoice.getValorUnitario());
		System.out.printf("\nValor da compra 1: $%.2f \n", buyValue);

		Invoice invoice2 = new Invoice(2, "Teclado", 3, 20.00);
		invoice2.displayMessage();
	}
}		