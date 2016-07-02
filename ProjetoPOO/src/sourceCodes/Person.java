package sourceCodes;

public class Person {
	
	private String name;
	private String consultDate;
	private String medType;
	private boolean statusConsult;
	
		
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
