

import java.util.Scanner;

public class Questão5 {
	static Scanner x = new Scanner(System.in);
	public static void main(String[] args) {
		float F = 0;
		
		System.out.println("Informe a tempertura em Fahrenheit");
		F = x.nextFloat();
		System.out.println("A temperatura em Fahrenheit será " + F + "ºF");
		System.out.println("A temperatura em graus Celsius será " + 5 * (F-32) / 9 + "ºC");
		
		
		
		

	}

}