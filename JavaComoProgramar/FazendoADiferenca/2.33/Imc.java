import java.util.Scanner;

public class Imc {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);

		double weightInKilograms;
		double heightInMeters;
		double imc;

		System.out.printf("Insira o seu peso em Kilogramas...");
		weightInKilograms = input.nextDouble();

		System.out.printf("Insira a sua altura em metros...");
		heightInMeters = input.nextDouble();

		imc = weightInKilograms / (heightInMeters * heightInMeters);
		String imcResult;

		if (imc < 18.5) {
			imcResult = imc + " - Abaixo do Peso. \n";
		} else if (imc > 18.5 && imc < 24.9) {
			imcResult = imc + " - Peso normal. \n";
		} else if (imc > 25 && imc < 29.9) {
			imcResult = imc + " - Acima do peso. \n";
		} else {
			imcResult = imc + " - Obesidade. \n";
		}

		System.out.printf(imcResult + "\n");

	}
	
}		