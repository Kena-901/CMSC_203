/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write an application that lets the user create a management company 
 * 				and add the properties managed by the company to its list. Assume the maximum 
 * 				number of properties handled by the company is 5.  
 * Due: 11/08/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Kenawak Abebe
*/

public class Property extends Plot {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	/**
	 * Constructor for Property class (First method)
	 */
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0.00;
		this.owner = "";
		this.plot = new Plot();
	}
	
	
	/**
	 * Constructor for Property class (Second method)
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName,String city,double rentAmount,String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	
	/**
	 * Constructor for Property class (Final method)
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName,String city,double rentAmount,String owner,
			 		int x,int y,int width,int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x,y,width,depth);
	}
	
	
	/**
	 * Copy Constructor 
	 * @param otherProperty
	 */
	public Property (Property otherProperty)
	{
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		this.plot = otherProperty.plot;
	}
	
	
	/**
	 * Setter method
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	
	
	/**
	 * Setter method
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	
	/**
	 * Setter method
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}

	
	/**
	 * Setter method
	 * @param owner
	 */
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public String getPropertyName()
	{
		return this.propertyName;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public String getCity()
	{
		return this.city;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public double getRentAmount()
	{
		return this.rentAmount;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public String getOwner()
	{
		return this.owner;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public Plot getPlot()
	{
		return this.plot;
	}
	
	
	/**
	 * toString Method for Property class
	 */
	public String toString()
	{
		return this.propertyName + ","+ this.city + ","+this.owner + ","+this.rentAmount;
	}
}
