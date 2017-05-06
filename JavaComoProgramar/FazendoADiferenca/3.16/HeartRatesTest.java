import java.util.Scanner;

public class HeartRatesTest {
	
	public static void main(String[] args) {

		/*HeartRates heartRates = new HeartRates("Joao", "carlos", 23, 8, 1984);
		String idadeAtual = heartRates.getIdadeEmAnos();

		System.out.printf("\nidade atual = " + idadeAtual + "\n");*/
		HeartRates heartRates = new HeartRates();
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

		heartRates.setNome(nome);
		heartRates.setSobrenome(sobrenome);
		heartRates.setDia(dia);
		heartRates.setMes(mes);
		heartRates.setAno(ano);
 
		int idade = heartRates.getIdadeEmAnos(dia, mes, ano);
		int frequenciaCardiacaBase = heartRates.getFrequenciaBase(idade);
		int frequenciaCardiacaMinima = heartRates.getFrequenciaMinima(idade);
		int frequenciaCardiacaMaxima = heartRates.getFrequenciaMaxima(idade);
		System.out.printf("\n" + nome + " " + sobrenome + " - " + "idade:" + idade + " anos");
		System.out.printf("\nSua frequência cardiaca máxima é: " + frequenciaCardiacaBase);
		System.out.printf("\nSua frequência cardiaca deve ficar entre: " + frequenciaCardiacaMinima + " e " + frequenciaCardiacaMaxima + "\n");
	}

}