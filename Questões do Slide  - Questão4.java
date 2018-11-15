import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
	        Scanner x = new Scanner(System.in);
	        int numero=0, antecessor =0, sucessor=0;
	        
	        System.out.println("Informe um número");
	        numero = x.nextInt();
	        sucessor = numero + 1;
	        antecessor = numero -1;
	        
	        System.out.println("O antecessor é "+antecessor);
	        System.out.println("O sucessor é "+sucessor);

	}

}
