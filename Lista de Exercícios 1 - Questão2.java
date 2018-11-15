import java.util.Scanner;

public class Questão2 {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
	float A = 0 ,B = 0 ;
	
	System.out.println("informe o primeiro numero");
	A = x.nextFloat();
	System.out.println("informe o segundo numero");
	B = x.nextFloat();
	
	System.out.println("Dividendo: " + A);
	System.out.println("Divisisor: " + B);
	System.out.println("quociente: " + A/B);
	System.out.println("Resto: " + A%B);
	
	

	}

}