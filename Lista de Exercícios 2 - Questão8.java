import java.util.Scanner;

public class Quest�o8 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		
		float salario;
		
		System.out.println("informe seu salario");
		salario = x.nextFloat();
		
		if (salario<280) {
			System.out.println("seu sal�rio antes do reajuste " + salario);
			System.out.println("seu percentual de aumento ser� de 20%");
			System.out.println("o valor do aumento ser� "+ (salario-(salario*0.20)));
			System.out.println("seu sal�rio ter� aumento de "+ salario*0.2);
			
		} else if (salario >= 280 && salario<700 ) {
			System.out.println("seu sal�rio antes do reajuste ser� de " + salario);
			System.out.println("seu percentual de aumento ser� de 15%");
			System.out.println("o valor do aumento ser� " +(salario+(salario*0.15)));
			System.out.println("seu sal�rio final com reajuste ser� de "+ salario*0.15);
			

		} else if (salario>=700 && salario<1500) {
			System.out.println("seu sal�rio antes do reajuste ser� de " + salario);
			System.out.println("seu percentual de aumento ser� de 10%");			
			System.out.println("o valor do aumento ser� "+ (salario-(salario*0.10)));
			System.out.println("seu sal�rio final com reajuste ser� de "+ salario*0.10);
			

		}else if (salario>=1500) {
			System.out.println("seu sal�rio final com reajuste ser� de "+ salario*0.10);
			System.out.println("seu percentual de aumento ser� de 5%");
			System.out.println("o valor do aumento ser� "+ (salario-(salario*0.05)));
			System.out.println("seu sal�rio ser� de "+ salario*0.05);
		
			
		}else if (salario == 0) {
			System.out.println("Valor invalido");
		}
		
		


	}

}
