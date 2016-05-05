package question_3;

import java.util.Scanner;

public class TestCalc {
	public static void main(String[] args) {
		
	CalculatorScien teste = new CalculatorScien();
	Scanner input = new Scanner(System.in);
		
	
	System.out.println("Choose operation + - * /: ^ s");
	char OP = input.next().charAt(0);
	
	if(OP == 's'){		
	System.out.println("Enter with A:");
	teste.setA(input.nextDouble());
	}
	
	else{
	System.out.println("Enter with A:");
	teste.setA(input.nextDouble());
	System.out.println("Enter with B:");
	teste.setB(input.nextDouble());	
	}
	

	
	
	switch (OP){
	
	case '+':
		System.out.println("Sum = "+ teste.sumAB());
		break;
	case '-':	
		System.out.println("Subtration = "+ teste.subAB());
		break;
	case '*':
		System.out.println("Multiplication = "+ teste.mulAB());
		break;
	case '/':
		if(teste.divAB() == 0)
			System.out.println("Invalid operation. B couldn't be 0");
		else		
		System.out.println("Division = "+ teste.divAB());
		break;
	
	case '^':
		System.out.println("Potentiation = "+teste.poten());
		break;
		
	case 's':
		System.out.println("Square Root= "+teste.squareRoot());
		break;
		
		
		
	
	}
	
	input.close();
	
			
	}

}
