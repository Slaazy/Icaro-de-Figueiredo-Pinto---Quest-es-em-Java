import java.util.Scanner;

public class Questão6 {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		float saldo = 0;
		
		System.out.println("informe seu saldo");
		saldo = x.nextFloat();
		System.out.println("o reajuste será " + 0.03*saldo);
		
	}

}
