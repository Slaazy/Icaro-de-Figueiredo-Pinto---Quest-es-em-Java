import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		int A = 0,B = 0;

		System.out.println("informe A");
		A = x.nextInt();
		System.out.println("informe B");
		B = x.nextInt();
		
		if (A % B == 0 ) {
			System.out.println("A e divisivel por B");
		}
		else {
			System.out.println("A não e divisivel por B");
		}
			
		

}
}
