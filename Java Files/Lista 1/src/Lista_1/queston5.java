package Lista_1;

public class queston5 {

  public static void recebe (String local){
	
   
   int length = local.length() - 1;
   int index = 0;
   int i;
   
   for (i = length; i >= 0; i--){
	   
	   if (local.charAt(i) == '/'){
		 
		 break;
		 
	   }
	   index++;
	   
   }
   
   
   char novo;   
   
   System.out.println("Caminho eh:");
   
   for (i = (local.length() - index); i < local.length(); i ++){
	   
	  novo = local.charAt(i);
	  
	  System.out.print("" +novo);
	   
	   
   }
	  
	  

	  
	  
	  
  }
	
	
	
	

}
