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
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
public class ManagementCompany extends Property{
	
	static final int MAX_PROPERTY = 5;
	static final int MGMT_WIDTH = 10;
	static final int MGMT_DEPTH = 10;
	
	private String name;
	private String taxID;
	private double mgmFee;
	private Property [] mgmProperty = new Property[MAX_PROPERTY];
	private Plot plot;
	private int numberOfProperties;
	
	/**
	 * Constructor for Management class (First method)
	 */
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0.00;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
	}
	
	/**
	 * Constructor for Management class (Second method)
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name,String taxID,double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
	}
	
	/**
	 * Constructor for Management class (Third method)
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name,String taxID,double mgmFee,int x,int y,int width,int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x,y,width,depth);
	}
	
	/**
	 * Constructor for Management class (Final method)
	 * @param otherCompany
	 */
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.plot = otherCompany.plot;
	}
	
	/**
	 * Getter method for name
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Getter method for tax ID
	 * @return
	 */
	public String getTaxID()
	{
		return this.taxID;
	}
	
	/**
	 * Getter method for property array
	 * @return
	 */
	public Property[] getProperties()
	{
		return this.mgmProperty;
	}
	
	/**
	 * Getter method for Management fee
	 * @return
	 */
	public double getMgmFeePer()
	{
		return this.mgmFee;
	}
	
	/**
	 * Getter method for plot
	 */
	public Plot getPlot()
	{
		return this.plot;
	}
	
	/**
	 * Overloaded method for adding property (First method )
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return
	 */
	public int addProperty(String name,String city,double rent,String owner)
	{
		int result= 5;
		Property pr1= new Property(name,city,rent,owner);
		
		if(isPropertiesFull())
		{
			result = -1;
		}
		else if((this.plot.encompasses(pr1.getPlot())))
		{
			result = -3;
		}
		else if(getPropertiesCount() != 0)
		{
			for(int i=0; i < getPropertiesCount(); i++)
			{
				if(mgmProperty[i].getPlot().encompasses(pr1.getPlot()))
				{
					break;
				}
				result = -4;			
			}
		}
		else
		{
			for(int i=0; i < mgmProperty.length; i++)
			{
				if(mgmProperty[i] == null)
				{
					mgmProperty[i] = pr1;
					result = i;
					break;
				}	
			}	
		}
		
		this.mgmFee = (rent* this.mgmFee)/100;
		
		return result;
	}
	
	/**
	 *  Overloaded method for adding property (Second method)
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth)
	{
		int result= 0;
		Property pr1= new Property(name,city,rent,owner,x,y,width,depth);
		
		if(isPropertiesFull())
		{
			result = -1;
		}
		else if((this.plot.encompasses(pr1.getPlot())))
		{
			result = -3;
		}
		 else if(getPropertiesCount() != 0)
		{
			for(int i=0; i < getPropertiesCount(); i++)
			{
				if(mgmProperty[i].getPlot().encompasses(pr1.getPlot()))
				{
					break;
				}
				result = -4;			
			}
		}
		else
		{
			for(int i=0; i < mgmProperty.length; i++)
			{
				if(mgmProperty[i] == null)
				{
					mgmProperty[i] = pr1;
					result = i;
					break;
				}	
			}	
		}
		
		this.mgmFee = (rent* this.mgmFee)/100;
		
		return result;
	}
	
	/**
	 *  Overloaded method for adding property (Final method )
	 * @param property
	 * @return
	 */
	public int addProperty(Property property)
	{
		int result= 0;
		
		
		if(isPropertiesFull())
		{
			result = -1;
		}
		else if( property == null)
		{
			result = -2;
		}
		else if((this.plot.encompasses(property.getPlot())))
		{
			result = -3;
		}
		else if(getPropertiesCount() != 0)
		{
			for(int i=0; i < getPropertiesCount(); i++)
			{
				if(mgmProperty[i].getPlot().overlaps(property.getPlot()))
				{
					result = -4;
					break;
				}
				
			}
			
			for(int i=0; i < mgmProperty.length; i++)
			{
				if(mgmProperty[i] == null)
				{
					mgmProperty[i] = property;
					result = i;
					break;
				}
			}
			
				
		}
		else
		{
			for(int i=0; i < mgmProperty.length; i++)
			{
				if(mgmProperty[i] == null)
				{
					mgmProperty[i] = property;
					result = i;
					break;
				}	
			}	
		}
		
		this.mgmFee = (property.getRentAmount()* this.mgmFee)/100;
		return result;	
	}
	
	/**
	 * Method to get total method
	 * @return
	 */
	public double getTotalRent()
	{
		double rentTotal=0;
		
		for(int i = 0; i < getPropertiesCount();i++)
		{
			rentTotal += mgmProperty[i].getRentAmount();
		}
		return rentTotal;
	}
	
	/**
	 * Method to get highest rent property
	 * @return
	 */
	public Property getHighestRentPropperty()
	{
		Property highest = new Property();
		
		for(int i = 0; i <  getPropertiesCount();i++)
		{
			 if((mgmProperty[i].getRentAmount()) > (highest.getRentAmount()))
			 {
				 highest = mgmProperty[i];
			 }
		}
		
		return highest;
	}
	
	/**
	 * Method to remove the last property from Array
	 */
	public void removeLastProperty()
	{
		mgmProperty[(getPropertiesCount() - 1)] = null;
	}
	
	/**
	 * Method to check if Array is full
	 * @return
	 */
	public boolean isPropertiesFull()
	{
		boolean result = true;
		
		for(int i=0; i < mgmProperty.length; i++)
		{
			if(mgmProperty[i] == null)
				result = false;
		}
		
		return result;
	}
	
	/**
	 * Method to keep count of added properties
	 * @return
	 */
	public int getPropertiesCount()
	{
			int counter = 0;
		for (int i = 0; i < mgmProperty.length; i++)
		{
			 if (mgmProperty[i] == null)
			 {
				   counter ++;	 
			 }
		}
		   
		return (MAX_PROPERTY - counter);
	}
	
	/**
	 * Method to check if management fee is in bound 
	 * @return
	 */
	public boolean isMangementFeeValid()
	{
		boolean valid;
		
		if(mgmFee >= 0 && mgmFee <= 100)
		{
			valid = true;
		}
		else
			valid = false;

		return valid;
	}
	
	/**
	 * toString Method to display information of Array
	 */
	public String toString()
	{
		StringBuilder full = new StringBuilder();
		for(int i=0;i<getPropertiesCount();i++) 
		{
		  full.append(mgmProperty[i].toString()+"\n");
		}
		return "List of the properties for "+ this.name+ ", taxID: " + this.taxID +"\n"
		+ "______________________________________________________\n"
		+ full.toString()
		+ "______________________________________________________\n\n"
		+ " total management Fee: " + this.mgmFee;
	}
	
}
