import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		float produto1,produto2,produto3;
		
		System.out.println("informe o primeiro produto");
		produto1 = x.nextFloat();
		
		System.out.println("informe o segundo produto");
		produto2 = x.nextFloat();
		
		System.out.println("informe o terceiro produto");
		produto3 = x.nextFloat();
		
		if (produto1<produto2 && produto1<produto3) {
			System.out.println("o mais barato será " + produto1);
		}
		else if (produto2<produto1 && produto2<produto3) {
			System.out.println("o mais barato será " + produto2);
		}
		else if (produto3<produto1 && produto3<produto2) {
			System.out.println("o mais barato será");
		}
	
		


	}

}
