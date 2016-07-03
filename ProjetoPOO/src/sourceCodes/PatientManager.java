package sourceCodes;

import java.util.List;
import java.util.ArrayList;

public class PatientManager {
	
	
  private List <Person> patientList = new ArrayList<Person>();

  
 
 
  	public  List<Person> getPatientList() {
	
  		return patientList;
}


	public void addPatientToList(String name, String consultDate, String medType){
  		
  		Person teste = new Person();
  		
  		teste.setName(name);
  		teste.setConsultDate(consultDate);
  		teste.setMedType(medType);
  		teste.setStatusConsult(false);
  		
  	
  		this.patientList.add(teste);
    		
  	}
  	
  	
  	
  	
  	
	
	
  	
  	
  	//Debug code block
 /*
  	public static void main(String[] args) {
		
  		addPatientToList("Otto", "consultDate", "medType");
  		addPatientToList("Eu", "Date", "medCardio");
  		addPatientToList("Tu", "Depois", "Odonto");	
  		addPatientToList("Aline", "Agosto", "Clínico");	
  		
  		
  		
  		List <Person> receiveList = getPatientList();
  		
  		
  		
  		 
  		int i = 0;
  		
  		for (i = 0; i <receiveList.size(); i++){
  			
  			System.out.print("Nome:" +receiveList.get(i).getName()+" ");
  			System.out.print("Consulta Data:" +receiveList.get(i).getConsultDate()+" ");
  			System.out.print("Medico:" +receiveList.get(i).getMedType()+" ");
  			
  			if(!receiveList.get(i).isStatusConsult())
  			System.out.println("Status: False");
  			else
  				System.out.println("Status: True");
  			
  		}
  		
  		
  		
  		
  		
  		
	}
 
 */
 
	
	
	
	
	
	
	

}
