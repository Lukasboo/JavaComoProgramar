public class Invoice {
	private int numero;
	private String descricao;
	private int quantidade;
	private double valorUnitario;

	public Invoice() {
		
	}

	public Invoice(int numero, String descricao, int quantidade, double valorUnitario) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public void setNumero(int numero) {
			this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setDescricao(String descricao) {
			this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			this.quantidade = 0;
		}
			
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setValorUnitario(double valorUnitario) {
		if (valorUnitario > 0) {
			this.valorUnitario = valorUnitario;
		} else {
			this.valorUnitario = 0.0;
		}
			
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public double getInvoiceAmount() {
		return valorUnitario * quantidade;
	}

	public void displayMessage() {
		System.out.printf("Número do Item: " + numero + "\n");
		System.out.printf("Quantidade: " + quantidade + "\n");
		System.out.printf("Descrição: " + descricao + "\n");
		System.out.printf("Valor unitário: $%.2f", valorUnitario);
		double buyValue = getInvoiceAmount();
		System.out.printf("\nValor da compra 1: $%.2f \n", getInvoiceAmount());
	}

}
