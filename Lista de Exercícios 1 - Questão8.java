import java.util.Scanner;

public class Quest�o8 {
	//� a mesm quest�o da 3
	static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		float horas ,ganho;
		
		System.out.println("informe as horas");
		horas = x.nextFloat();
		System.out.println("informe seu ganho");
		ganho = x.nextFloat();
		System.out.println("seu ganho ao m�s ser�: "+ ganho*horas);
		

	}

}
