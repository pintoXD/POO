package sourceCodes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//import java.io.Serializable;



public class fileManager {
	
	
	public fileManager(){
		
		try{
		    // Serialize data object to a file
		    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("MyData.ser"));
		    out.writeObject(myData);
		    out.close();

		    // Serialize data object to a byte array
		    ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
		    out = new ObjectOutputStream(bos) ;
		    out.writeObject(myData);
		    out.close();

		    // Get the bytes of the serialized object
		    byte[] buf = bos.toByteArray();
		} catch (IOException e) {
		}
		
		
		
		
		
	}
	
	
	

}
