
import java.util.Scanner;

public class Quest�o4 {
 
	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner x = new Scanner (System.in);
		
		System.out.println("informe o primeiro");
		n1 = x.nextInt();
		System.out.println("Informe o segundo");
		n2 = x.nextInt();
		System.out.println("informe o terceiro");
		n3 = x.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			if(n2 > n3) {
				System.out.println("A ordem ser� " + n1+","+n2+","+n3);	
			} 
			else {
				System.out.println("A ordem ser� " + n1+","+n3+","+n2);
			}
		}
		
		else 
			if (n2>n1 && n2 > n3) {
				if(n1>n3) {
					System.out.println("A ordem ser� " + n2+","+n1+","+n3);
				}
				else {
					System.out.println("A ordem ser� " + n2+","+n3+","+n1);
				}
			}
		
			else
				if(n3>n1 && n3>n2) {
					if(n1>n3) {
						System.out.println("A ordem ser� " + n3+","+n1+","+n2);
					}
					else {
						System.out.println("A ordem ser� " + n3+","+n2+","+n1);
					}
				}
	}
}
				
			
				
		

