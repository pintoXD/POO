package sourceCodes;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializeData {

	private List<Person> list;
	
	
	
	public List<Person> getList() {
		return list;
	}


	@SuppressWarnings("unchecked")
	public DeserializeData(String fileName) {
		// TODO Auto-generated constructor stub
		
        try
        {
        	
        	//fileName.createNewFile();
        	
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            this.list = (ArrayList<Person>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            
            //getList();
            
            
         }
        
        catch(FileNotFoundException e){
        	System.out.println("Olá");
        	this.list = null;
        }
        
        catch(IOException ioe){
            // ioe.printStackTrace();
             //FileOutputStream fileOut = new FileOutputStream("PatientsData.ser");
         	
             //fileOut.close();
         	
             
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
            
          }
	
	
	}
	
	
	
	
}
