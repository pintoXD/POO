package question_2;

public class AdressBook {

	private String name;
	private String adress;
	private String phone;
	private String birthday;
	private static int counter = 0;

	public void setBook(String name, String adress, String phone, String birthday){
          
		counter++;
		
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.birthday = birthday;


	}


	public String getName(){
		return name;
	}

	public String getAdress(){
		return adress;
	}

	public String getPhone(){
		return phone;
	}

	public String getBirthday(){
		return birthday;
	}

	public int getCounter(){
		return counter;
	}

}
