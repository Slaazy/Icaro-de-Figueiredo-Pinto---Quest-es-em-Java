import java.util.Scanner;

public class Quest�o6 {

	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);

	String produto;
	float pre�o = 0;
	int pagamento;

	System.out.println("informe o produto");
	produto = x.nextLine();
	System.out.println("informe o pre�o");
	pre�o= x.nextFloat();
	System.out.println("1 para prazo e 2 para � vista");
	pagamento = x.nextInt();
	
	if (pagamento == 1) {
		System.out.println("seu valor final a prazo com desconto ser� " + ((pre�o-pre�o*5/100)));
	}
	else
		if(pagamento == 2) {
			System.out.println("seu valor final � vista com desconto " + ((pre�o+pre�o-2/100)));
		}
	
	

	}
}


