

import java.util.Scanner;

public class Quest�o5 {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		float F = 0;
		
		System.out.println("Informe a tempertura em Fahrenheit");
		F = x.nextFloat();
		System.out.println("A temperatura em Fahrenheit ser� " + F + "�F");
		System.out.println("A temperatura em graus Celsius ser� " + 5 * (F-32) / 9 + "�C");
		
		
		
		

	}

}