public class Patient 
{
	//Create fields of the class Patient
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String number;
	private String emergencyName;
	private String emergencyNumber;
	private int zipCode;
	
	//Create a no arg constructor.
	public Patient()
	   {
		
	   }
	
	//Create parameterized constructor for user's full name.
	public Patient(String first,String middle,String last)
	   {
			this.firstName = first;
			this.middleName = middle;
			this.lastName = last;
	   }
	
	//Create parameterized constructor for user's information.
	public Patient(String first,String middle,String last,String address1,String address2,String address3,int zip,String phone,String eName,String eNumber)
	   {
			this.firstName = first;
			this.middleName = middle;
			this.lastName = last;
			this.streetAddress = address1;
			this.city = address2;
			this.state = address3;
			this.zipCode = zip;
			this.number = phone;
			this.emergencyName = eName;
			this.emergencyNumber = eNumber;
	   }
	
	// Create an accessor methods for all fields of the class.  
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getMiddleName()
	{
		return middleName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getZipCode()
	{
		return zipCode;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public String getEmergencyName()
	{
		return emergencyName;
	}
	
	public String getEmergencyNumber()
	{
		return emergencyNumber;
	}
	
	//Create a mutator methods for all fields of the class.
	public void setFirstName(String inputName1)
	{
		firstName = inputName1;
	}
	
	public void setMiddleName(String inputName2)
	{
		middleName = inputName2;
	}
	
	public void setLastName(String inputName3)
	{
		lastName = inputName3;
	}
	
	public void setStreetAddress(String inputStreetAddress)
	{
		streetAddress = inputStreetAddress;
	}
	
	public void setCity(String inputCity)
	{
		city = inputCity;
	}
	
	public void setState(String inputState)
	{
		state = inputState;
	}
	
	public void setZipCode(int inputZip)
	{
		zipCode = inputZip;
	}
	
	public void setNumber(String inputNumber)
	{
		number = inputNumber;
	}
	
	public void setEmergencyName(String inputEmergencyName)
	{
		emergencyName = inputEmergencyName;
	}
	
	public void setEmergencyNumber(String inputEmergencyNumber)
	{
		emergencyNumber = inputEmergencyNumber;
	}
	
	//Create buildFullName method.
	public String buildFullName()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	
	//Create buildAddress method.
	public String buildAddress()
	{
		return streetAddress + ", " + city + ", " + state + ", " + zipCode;
	}
	
	//Create buildEmergencyContact method.
	public String buildEmergencyContact()
	{
		return emergencyName + " " + emergencyNumber ;
	}
	
	//Create toString method.
	public String toString()
	{
		return "Patient Info: \r\n"+"  Name: " + buildFullName()+"\r\n  Address: " + buildAddress()
				+"\r\n  Emergency Contact: " + buildEmergencyContact();
	}

}