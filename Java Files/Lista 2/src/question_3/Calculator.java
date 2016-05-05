package question_3;

public class Calculator {
	
	private double numA;
	private double numB;
	
	
	public void setA(double numA){
		this.numA = numA;
		
	}
	
	public void setB(double numB){
		this.numB = numB;
	
	}

	
	public double getA(){
		return numA;
	}
	
	 public double getB(){
		 return numB;
	 }
	

	 
	public double sumAB(){
		
		return (getA() + getB());
				
	}

	public double subAB(){
		
		return (getA() - getB());
				
	}
		
	public double mulAB(){
		
		return (getA() * getB());
				
	}
	
	public double divAB(){
		
		if(getB() > 0)	
		return (getA() / getB());
		else
		return 0;
		
	}
	
	
	
	

}
