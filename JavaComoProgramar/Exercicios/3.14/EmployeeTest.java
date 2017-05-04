import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) { 

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();

		employee1.setNome("Joao");
		employee1.setSobrenome("Silva");
		employee1.setSalarioMensal(-1000.00);
		double salarioMensal1 = employee1.getSalarioMensal();
		double salarioAnual1 = salarioMensal1 * 12;
		double salarioAnualAumento1 = salarioAnual1 + (salarioAnual1/100*10);

		employee2.setNome("José");
		employee2.setSobrenome("Silva");
		employee2.setSalarioMensal(2000.00);
		double salarioMensal2 = employee2.getSalarioMensal();
		double salarioAnual2 = salarioMensal2 * 12;
		double salarioAnualAumento2 = salarioAnual2 + (salarioAnual2/100*10);

		System.out.printf("Nome: " + employee1.getNome() + " " + employee1.getSobrenome());
		System.out.printf("\nSalario: $%.2f", salarioMensal1);
		System.out.printf("\nSalario Anual: $%.2f", salarioAnual1);
		System.out.printf("\nSalario Anual (aumento): $%.2f", salarioAnualAumento1);

		System.out.printf("\nNome: " + employee2.getNome() + " " + employee2.getSobrenome());
		System.out.printf("\nSalario: $%.2f", salarioMensal2);
		System.out.printf("\nSalario Anual: $%.2f", salarioAnual2);
		System.out.printf("\nSalario Anual (aumento): $%.2f", salarioAnualAumento2);

		Employee employee3 = new Employee("Marcos", "Silva", 3000.00);
		Employee employee4 = new Employee("Daniel", "Silva", 4000.00);

		employee3.displayMessage();
		employee4.displayMessage();

	}

}	