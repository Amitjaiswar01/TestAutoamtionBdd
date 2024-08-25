package Utilies;

import java.time.LocalTime;
import java.util.Random;

public class CustomerFormDetails {

	private String ListOfFirstName[] = {"Eddard", "Robert", "Jaime", "Catelyn", "Cersei", "Daenerys", "Jorah", "Viserys", "Jon", "Sansa", "Arya", "Joffrey", "Bronn", "Ramsay", "Theon"  };
	private String ListOfLastName[] = { "Stark", "Baratheon", "Lannister", "Targaryen", "Mormont", "Snow", "Greyjoy", "Clegane", "Tarly", "Tyrell" };
	
	public CustomerDetails GenerateFormDeatails() {
		LocalTime myObj = LocalTime.now();
    	Random random =  new Random();
    	
    	String first = ListOfFirstName[random.nextInt(0,ListOfFirstName.length)]+myObj.getNano();
    	String last = ListOfLastName[random.nextInt(0,ListOfLastName.length)]+myObj.getNano();
    	String email = first+"."+last+"."+myObj.getNano()+"@guerrillamail.info";
    	String password = "Test@123#123";
    	String confirmPassword = "Test@123#123";
    	
    	return new CustomerDetails(first, last, email, password, confirmPassword);
    	
	}
}