import java.util.Scanner;

public class HealthProfileTest {
	
	public static void main(String[] args) {

		/*HeartRates heartRates = new HeartRates("Joao", "carlos", 23, 8, 1984);
		String idadeAtual = heartRates.getIdadeEmAnos();

		System.out.printf("\nidade atual = " + idadeAtual + "\n");*/
		HealthProfile healthProfile = new HealthProfile();
		Scanner input = new Scanner(System.in);
		System.out.print("\nDigite seu nome: ");
		String nome = input.next();
		System.out.print("\nDigite seu sobrenome: ");
		String sobrenome = input.next();
		System.out.printf("\nDigite o dia do seu nascimento: ");
		int dia = input.nextInt();
		System.out.printf("\nDigite o mês do seu nascimento: ");
		int mes = input.nextInt();
		System.out.printf("\nDigite o ano do seu nascimento: ");
		int ano = input.nextInt();
		System.out.printf("\nDigite o seu peso: ");
		double peso = input.nextDouble();
		System.out.printf("\nDigite a sua altura: ");
		double altura = input.nextDouble();

/*		heartRates.setNome(nome);
		heartRates.setSobrenome(sobrenome);
		heartRates.setDia(dia);
		heartRates.setMes(mes);
		heartRates.setAno(ano);*/
 
		int idade = healthProfile.getIdadeEmAnos(dia, mes, ano);
		int frequenciaCardiacaBase = healthProfile.getFrequenciaBase(idade);
		int frequenciaCardiacaMinima = healthProfile.getFrequenciaMinima(idade);
		int frequenciaCardiacaMaxima = healthProfile.getFrequenciaMaxima(idade);
		double IMC = healthProfile.getImc(peso, altura);
		System.out.printf("\n" + nome + " " + sobrenome + " - " + "idade:" + idade + " anos");
		System.out.printf("\nSua frequência cardiaca máxima é: " + frequenciaCardiacaBase);
		System.out.printf("\nSua frequência cardiaca deve ficar entre: " + frequenciaCardiacaMinima + " e " + frequenciaCardiacaMaxima + "\n");
		System.out.printf("\nSeu Imc é: " + IMC);
		System.out.printf("\nTabela IMC");
		System.out.printf("\nAbaixo de 17 - Muito abaixo do peso");
		System.out.printf("\nEntre 17 e 18,49 - Abaixo do peso");
		System.out.printf("\nTabela IMCEntre 18,5 e 24,99 -	Peso normal");
		System.out.printf("\nTabela IMCEntre 25 e 29,99 - Acima do peso");
		System.out.printf("\nTabela IMCEntre 30 e 34,99 - Obesidade I");
		System.out.printf("\nTabela IMCEntre 35 e 39,99 - Obesidade II (severa)");
		System.out.printf("\nTabela IMCAcima de 40 - Obesidade III (mórbida)" + "\n");
	}

}