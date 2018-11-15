import java.util.Scanner;

public class Questão11 {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		float segundos;
		
		System.out.println("Informe o tempo de duração do evento");
		segundos = x.nextFloat();
		System.out.println("Em horas será " + segundos/3600 );
		System.out.println("Em minutos será " + segundos/60);
		System.out.println("Em segundos será " + segundos);
		
		
		
	

	}

}
