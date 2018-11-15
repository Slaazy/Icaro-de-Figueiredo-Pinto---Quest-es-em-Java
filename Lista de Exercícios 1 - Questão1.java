
import java.util.Scanner;

public class Questão1 {
	static Scanner x = new Scanner(System.in);
	public void main (String[] args) { 
		String nome ;
		int idade;
		System.out.println("Informe seu nome");
		nome = x.toString();
		System.out.println("informe sua idade");
		idade = x.nextInt();
		
		System.out.println("seu nome: " + nome);
		System.out.println("sua idade: " + idade);
		
	}
}
