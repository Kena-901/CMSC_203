
public class Procedure 
{
	//Create fields of the class Patient
	private String name;
	private String date;
	private String practitioner;
	private double charge;
	
	//Create a no arg constructor.
	public Procedure()
	{
		
	}
	
	//Create parameterized constructor for procedure name and date.
	public Procedure(String pName,String pDate)
	{
		this.name = pName;
		this.date = pDate;
	}
	
	//Create parameterized constructor for procedure practitioner and charge.
	public Procedure(String pPractitioner,double pCharge)
	{
		this.practitioner = pPractitioner;
		this.charge = pCharge;
	}
	
	// Create an accessor methods for all fields of the class.
	public double getCharge()
	{
		return charge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public String getPractitioner()
	{
		return practitioner;
	}
	
	//Create a mutator methods for all fields of the class.
	public void setCharge(double inputCharge)
	{
		charge = inputCharge;
	}
	
	public void setName(String inputName)
	{
		name = inputName;
	}
	
	public void setDate(String inputDate)
	{
		date = inputDate;
	}
	
	public void setPractitioner(String inputPractitioner)
	{
		practitioner = inputPractitioner;
	}
	
	//Create toString method.
	public String toString()
	{
		return "\r\n\tProcedure: " + name + "\r\n\tProcedure Date: " + date + 
				"\r\n\tPractitioner: " + practitioner + "\r\n\tCharge: " + charge;
	}
	
}
