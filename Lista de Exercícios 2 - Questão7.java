import java.util.Scanner;

public class Quest�o7 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		String setor;
		float horas;
		
		System.out.println();
		setor= x.nextLine();
		System.out.println();
		horas = x.nextFloat();
		
		
		if(setor == "Administrativo") {
		   System.out.println("seu sal�rio final ser� de " + "R$" + horas*12);	   
		}
		else if(setor == "Produtivo") {
			   System.out.println("seu sal�rio final ser� de " + "R$" + horas*10);	
		}
		else 
			if (setor != "produtivo" || setor != "administrativo");
		System.out.println("Valor invalido");
		

	}

	}

