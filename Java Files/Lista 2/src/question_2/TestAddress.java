package question_2;

public class TestAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AdressBook teste = new AdressBook();
	
	teste.setBook("Otto","Rua E-25" , "89228104" , "12/09");
	
	System.out.println("Nome: " + teste.getName());
	System.out.println("Adress: " + teste.getAdress());
			
	teste.setBook("Aline","Rua adasdasdasd-25" , "0000000" , "05/08");	
	
	System.out.println("Nome: " + teste.getName());
	System.out.println("Adress: " + teste.getAdress());
	
	System.out.println("Counter: "+teste.getCounter());
	
	

	}

}
