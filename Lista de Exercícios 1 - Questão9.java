import java.util.Scanner;

public class Quest�o9 {
	static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		int n1 =0,n2= 0;
		float n3;
		
		System.out.println("Numero inteiro 1");
		n1 = x.nextInt();
		System.out.println("Numero inteiro 2");
		n2 = x.nextInt();
		System.out.println("Numero Real");
		n3 = x.nextFloat();
		System.out.println("Seu produto ser� " + (n1)*2 +" e " +(n2)/2);
		System.out.println("Sua soma ser� " + (n1*3) +n3);
		System.out.println("Seu cubo ser� " + n3*n3);
		

	}

}
