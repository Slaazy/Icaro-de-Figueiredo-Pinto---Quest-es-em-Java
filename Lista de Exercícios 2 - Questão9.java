import java.util.Scanner;

public class Quest�o9 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		float A,B,C;
		
		System.out.println("Informe o primeiro lado");
		A = x.nextFloat();
		System.out.println("informe o segundo lado");
		B = x.nextFloat();
		System.out.println("informe o terceiro lado");
		C = x.nextFloat();
		
		if (A + B > C || A + C > B || B + C > A) {
			if (A == B && B == C) {
				System.out.println("Equilatero");
			} 
		   else 
			   if(A == B && C != B || B==C && A!=B || A==C && B!=A) {
				System.out.println("Is�sceles");
			}
		   else  
		       if(A!=B && A!=C && B!=C) {
			    System.out.println("Escaleno");
		       }
			    
		        else 
		    	   System.out.println("n�o e um tri�ngulo");
		}
	}
}
		       
	

			    
			    
	
			
		
	

		       	




