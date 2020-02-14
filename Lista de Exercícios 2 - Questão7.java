import java.util.Scanner;

public class Questão7 {

//verificar o setor e calcular o salario final de acordo com as horas trabalhadas
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		String setor;
		float horas;
		
		System.out.println();
		setor= x.nextLine();
		System.out.println();
		horas = x.nextFloat();
		
		
		if(setor == "Administrativo") {
		   System.out.println("seu salário final será de " + "R$" + horas*12);	   
		}
		else if(setor == "Produtivo") {
			   System.out.println("seu salário final será de " + "R$" + horas*10);	
		}
		else 
			if (setor != "produtivo" || setor != "administrativo");
		System.out.println("Valor invalido");
		

	}

	}

