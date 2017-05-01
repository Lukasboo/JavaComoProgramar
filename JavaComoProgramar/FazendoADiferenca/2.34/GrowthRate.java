import java.util.Scanner;

public class GrowthRate {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);

		double growthRate = 1.2;
		System.out.printf("A média da taxa de crescimento mundial anual é de 1.2 Porcento ...\n");
		System.out.printf("A população mundial é em média 7.501.555,515 pessoas...\n");
		double worldPeople = 7501555.51;
		double growthOneYear = worldPeople + ((worldPeople * 1.2)/100);
		double growthTwoYear = growthOneYear + ((growthOneYear * 1.2)/100);
		double growthThreeYear = growthTwoYear + ((growthTwoYear * 1.2)/100);
		double growthFourYear = growthThreeYear + ((growthThreeYear * 1.2)/100);
		double growthFiveYear = growthFourYear + ((growthFourYear * 1.2)/100);
		System.out.printf("População mundial estimada em um ano é " + growthOneYear + "\n");
		System.out.printf("População mundial estimada em dois anos é " + growthTwoYear + "\n");
		System.out.printf("População mundial estimada em três anos é " + growthThreeYear + "\n");
		System.out.printf("População mundial estimada em quatro anos é " + growthFourYear + "\n");
		System.out.printf("População mundial estimada em cinco anos é " + growthFiveYear + "\n");
	}	
}		