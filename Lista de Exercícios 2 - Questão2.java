
import java.util.Scanner;
public class Quest�o2 {

	public static void main(String[] args) {
	
		int num1,num2,num3;
		
		Scanner x = new Scanner (System.in);
		
		System.out.println("Informe o 1�-valor ");
		num1 = x.nextInt();
		System.out.println("Informe o 2�-valor ");
		num2 = x.nextInt();
		System.out.println("Informe o 3�-valor ");
		num3 = x.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println("Maior num�ro: "+num1);
			 if (num2 < num3) {
				System.out.println("Menor num�ro: "+num2);
			} else {
				System.out.println("Menor num�ro: "+num3);
				}
		}	 
		else 
			if (num2 > num1 && num2 > num3){
				System.out.println("Maior num�ro: "+num2);
			  if (num1 < num3) {
				System.out.println("Menor num�ro: "+num1);
			} else {
				System.out.println("Menor num�ro: "+num3);
			}
		}
		else 
			if (num3 > num1 && num3 > num2){
				System.out.println("Maior num�ro: "+num3);
				if (num2 < num1) {
				System.out.println("Menor num�ro: "+num2);
			} else {
				System.out.println("Menor num�ro: "+num1);
			}
		}		
		else 
			if (num1 == num2 && num2 == num3){  
					
				System.out.println("Todos os num�ros s�o iguais!!!");
				
			}	
		}
	}	
	


