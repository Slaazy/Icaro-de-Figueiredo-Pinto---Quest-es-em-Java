import java.util.Scanner;
public class Questão10 {

	public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
		
		System.out.printf("\nInforme sua altura:");
                float altura = x.nextFloat();
		
		float  pesoideal = (float) ((72.7 * altura) - (58));
		System.out.printf("\nSeu peso ideal será de: " + pesoideal);
	}
}
