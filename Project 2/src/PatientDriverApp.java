import java.text.DecimalFormat;

public class PatientDriverApp 
{

	//Create a main method.
	public static void main(String[] args) 
	{
		//Create a constant for programmer info.
		final String PROGRAMMER = "Kenawak Abebe";
		final String ID = "M21162238";
		final String DATE = "09/25/2023";
		
		//Create a patient1 object.
		Patient patient1 = new Patient();
		
		//Create 3 procedure objects.
		Procedure procedure1 = new Procedure();
		Procedure procedure2 = new Procedure();
		Procedure procedure3 = new Procedure();
		
		//Use accessors to set value for patient1 object.
		patient1.setFirstName("Thomas");
		patient1.setMiddleName("Frank");
		patient1.setLastName("Smith");
		patient1.setStreetAddress("3485 Sligo Ave");
		patient1.setCity("Silver Spring");
		patient1.setState("Maryland");
		patient1.setNumber("240-007-8081");
		patient1.setEmergencyName("Caroline Smith");
		patient1.setEmergencyNumber("240-346-6395");
		patient1.setZipCode(20456);
		
		//Use accessors to set value for all 3 procedures object.
		procedure1.setName("CT-scan");
		procedure2.setName("Blood test");
		procedure3.setName("X-ray scan");
		
		procedure1.setDate("09/05/2023");
		procedure2.setDate("09/05/2023");
		procedure3.setDate("09/05/2023");
		
		procedure1.setPractitioner("Dr. Erwin");
		procedure2.setPractitioner("Dr. Watson");
		procedure3.setPractitioner("Dr. Davis");
		
		procedure1.setCharge(3012.23);
		procedure2.setCharge(1295.56);
		procedure3.setCharge(4500.45);
		
		//Use display methods to display output.
		displayPatient(patient1);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		//Display total charge and programmer info.
		System.out.println("\r\nTotal Charges: $" + calculateTotalCharges(procedure1,procedure2,procedure3));
		System.out.println("\r\nStudent Name: " + PROGRAMMER);
		System.out.println("MC#: " + ID);
		System.out.println("Due Date: " + DATE);

	}
	
	//Create displayPatient method.
	public static void displayPatient(Patient p1)
	{
		p1.toString();
		System.out.println(p1);	
	}
	
	//Create displayProcedure method.
	public static void displayProcedure(Procedure pro1)
	{
		pro1.toString();
		System.out.println(pro1);	
	}
	
	//Create calculateTotalCharges method.
	public static String calculateTotalCharges(Procedure ch1,Procedure ch2,Procedure ch3)
	{
		//Format output using DecimalFormat.
		DecimalFormat clean = new DecimalFormat("#,###.00"); 
		
		double total = ch1.getCharge()+ch2.getCharge()+ch3.getCharge();
		return clean.format(total);
	}

}
