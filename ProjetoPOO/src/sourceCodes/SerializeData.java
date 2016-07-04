package sourceCodes;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//import java.io.Serializable;



public class SerializeData {
	
	
	private List<Person> listOfPatients;
	
	
	public SerializeData(List<Person> oldPatientList){
		
		listOfPatients = new ArrayList<Person>(oldPatientList);
		
		try{
		    // Serialize data object to a file
			
			FileOutputStream fileOut = new FileOutputStream("PatientsData.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
		    out.writeObject(listOfPatients);
		    out.close();
		    fileOut.close();
		   
		    /* // Serialize data object to a byte array
		    ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
		    out = new ObjectOutputStream(bos) ;
		    out.writeObject(listOfPatients);
		    out.close();

		    // Get the bytes of the serialized object
		    byte[] buf = bos.toByteArray();*/
		    
		} catch (IOException e) {
		}
		
		
		
		
		
	}
	
	
	

}
