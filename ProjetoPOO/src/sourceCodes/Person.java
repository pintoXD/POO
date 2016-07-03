package sourceCodes;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private String consultDate;
	private String medType;
	private boolean statusConsult;
	
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
    public Person(String name, String consultDate, String medType, boolean statusConsult) {
		// TODO Auto-generated constructor stub
    	this.name = name;
    	this.consultDate = consultDate;
    	this.medType = medType;
    	this.statusConsult = statusConsult;
    	
    	
	}
	
		
    public String getName() {
		return name;
	}
	
   public void setName(Object name) {
		
		
		
		this.name = name.toString();
	}
	
   public String getConsultDate() {
		return consultDate;
	}
	public void setConsultDate(Object consultDate) {
		this.consultDate = consultDate.toString();
	}
	public String getMedType() {
		return medType;
	}
	public void setMedType(Object medType) {
		this.medType = medType.toString();
	}
	public boolean isStatusConsult() {
		return statusConsult;
	}
	public void setStatusConsult(boolean statusConsult) {
		this.statusConsult = statusConsult;
	}

	
	


}
