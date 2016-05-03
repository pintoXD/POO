package Lista_1;


import 	java.util.Scanner;

public class question_warm {

	
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);	
		
		System.out.println("Primeiro lado:");
		int sideA = input.nextInt();
		
		System.out.println("Segundo lado:");
		int sideB = input.nextInt();
		
		System.out.println("Primeiro lado:");
		int sideC = input.nextInt();
		
		
		verificaTriangulo(sideA, sideB, sideC);
		
		identify(sideA,sideB, sideC);

		
		input.close();
		
	}

	
	public static boolean verificaTriangulo (int a, int b, int c){
	if (((a + b) > c) && ((a + c) > b) && ((b + c) > a))
		return true;
	else
		return false;
		
		
		
	}
	
	
	public static void identify(int sideA, int sideB, int sideC){
			
		if (verificaTriangulo (sideA, sideB, sideC)){
		
		if ((sideA == sideB) && (sideA  == sideC ))
			{
				System.out.println("Equilatero");	
				
				
			}
			
			else if (  (sideA == sideB && sideA != sideC) ||
					   (sideA == sideC && sideA != sideB) ||	
					   (sideB == sideC && sideB != sideA)
					)	
			System.out.println("Isósceles");
			
			else 
				
			System.out.println("Escaleno");
			
			
			
		}	
		
		else
			
			System.out.println("Triangulo impossível");
	}
	
	
	
}
