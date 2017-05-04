public class Employee {

	private String nome;
	private String sobrenome;
	private double salarioMensal;

	public Employee() {}

	public Employee(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salarioMensal > 0) {
			this.salarioMensal = salarioMensal;	
		}
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSalarioMensal(double salarioMensal) {
		if (salarioMensal > 0) {
			this.salarioMensal = salarioMensal;	
		}		
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public double getSalarioAnual() {
		return salarioMensal * 12;
	}

	public double getSalarioAnualAumento() {
		double salarioAnual1 = salarioMensal * 12;
		return salarioAnual1 + (salarioAnual1/100*10);
	}

	public void displayMessage() {
		System.out.printf("\nNome: " + nome + " " + sobrenome);
		System.out.printf("\nSalario: $%.2f", salarioMensal);
		System.out.printf("\nSalario Anual: $%.2f", getSalarioAnual());
		System.out.printf("\nSalario Anual (aumento): $%.2f", getSalarioAnualAumento());
	}

}