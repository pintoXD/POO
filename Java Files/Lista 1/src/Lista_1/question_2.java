package Lista_1;

import java.util.*;

import java.lang.Math;

public class question_2 {


   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
	System.out.println("Manda o numero pra converter ae");
	int bitNum = input.nextInt();

	if (verifica(bitNum)){
		double decNum = converter(bitNum);
		
		System.out.println("Decimal number is: " + decNum);
		
		
	}
	else
		System.out.println("Wrong number");
	
	input.close();


	}

	private static boolean verifica(int a){
		String bitVerification = Integer.toString(a);
				
		System.out.println("String: " + bitVerification);		
		
		System.out.println("Entrou na Verifica");
		
		
		char test;
		int i;
		int soma = 0;
		
		for (i = 0; i < bitVerification.length(); i++)
		{
			test = bitVerification.charAt(i);
			System.out.println("Char: " + test);
			
			if (test != '0'  && test != '1'){
				
				soma = soma + 1;
			
				
			}
				
		}
		
		
		if (soma != 0)
			return false;
		else
		 return true;
		
		
		
	}
	
	
	private static double converter(int number){

	int i;	
		
		String binaryDigit = Integer.toString(number);
			
	double sum = 0;
	char aux;
	int aux2;
			
	aux2 = binaryDigit.length() - 1;
	
	for (i = 0; i < binaryDigit.length(); i++){
	//for ( i = binaryDigit.length() - 1; i <= 0 ; i--){
	      
		
		aux = binaryDigit.charAt(i);
				
			if(aux == '0')
				
				sum =  sum + 0;
			
			else					
				sum = sum + (Math.pow(2, aux2));
				
			aux2--;		
			}
	
		
	return sum;
	
	
	}

	
}
