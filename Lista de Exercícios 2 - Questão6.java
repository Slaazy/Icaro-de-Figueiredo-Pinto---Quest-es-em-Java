import java.util.Scanner;

public class Questão6 {

//valor final e prazo com desconto
	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);

	String produto;
	float preço = 0;
	int pagamento;

	System.out.println("informe o produto");
	produto = x.nextLine();
	System.out.println("informe o preço");
	preço= x.nextFloat();
	System.out.println("1 para prazo e 2 para à vista");
	pagamento = x.nextInt();
	
	if (pagamento == 1) {
		System.out.println("seu valor final a prazo com desconto será " + ((preço-preço*5/100)));
	}
	else
		if(pagamento == 2) {
			System.out.println("seu valor final à vista com desconto " + ((preço+preço-2/100)));
		}
	
	

	}
}


