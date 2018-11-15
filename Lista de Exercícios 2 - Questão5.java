import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {		
		
		Scanner x = new Scanner (System.in);
		char Turno;
		
		System.out.println("em que turno você estuda ?");
		Turno = x.next().charAt(0);
		
		
		if(Turno == 'v') {
			System.out.println("bom tarde");
		} 
		else if (Turno == 'm') {
			System.out.println("Bom dia");
		}
		else if (Turno == 'n') {
			System.out.println("Boa noite");
				
		}
		else if (Turno != 'V' || Turno != 'M' || Turno != 'N') {
			System.out.println("Valor invalido");
		}
	}
}
