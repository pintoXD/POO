package Lista_1;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o lado");
		int dado = input.nextInt();	
		
		if(verify(dado))
			makeSquare(dado);
		
		else
			System.out.println("Quadrado inválido");
		
		input.close();
	}
	
	
	private static boolean verify(int a)
	{
		if ( a < 1 || a >20)
			return false;
		
		else
			return true;
						
		
	}
	
	private static void makeSquare(int a){
		
		int i, j;
		for (i = 0; i < a; i++){
			System.out.print("*");
			
				for (j = 0; j < a; j++)
				{
					if (i == 0 || (i + 1) == a )
						System.out.print("*");
					else
						System.out.print(" ");
				
				}
				
			System.out.print("*");
			System.out.println();
		}
		
	}

}
