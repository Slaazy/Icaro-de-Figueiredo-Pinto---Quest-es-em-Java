import java.util.Scanner;

public class Quest�o11 {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		float segundos;
		
		System.out.println("Informe o tempo de dura��o do evento");
		segundos = x.nextFloat();
		System.out.println("Em horas ser� " + segundos/3600 );
		System.out.println("Em minutos ser� " + segundos/60);
		System.out.println("Em segundos ser� " + segundos);
		
		
		
	

	}

}
