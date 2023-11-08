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
public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	/**
	 * Constructor for Plot class (First method)
	 */
	public Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	
	/**
	 * Constructor for Plot class (Second method)
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	
	/**
	 * Constructor for Plot class (Final method)
	 * @param otherPlot
	 */
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.x; 
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.width;
	}
	
	
	/**
	 * setter method
	 * @param x
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	
	
	/**
	 * setter method
	 * @param y
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	
	
	/**
	 * setter method
	 * @param width
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	
	/**
	 * setter method
	 * @param depth
	 */
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public int getX()
	{
		return this.x;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public int getY()
	{
		return this.y;
	}
	
	
	/**
	 * getter method
	 * @return
	 */
	public int getWidth()
	{
		return this.width;
	}
	
	/**
	 * getter method
	 * @return
	 */
	public int getDepth()
	{
		return this.depth;
	}
	
	
	/**
	 * Method to check if one plot encompasses another plot
	 * @param plot
	 * @return
	 */
	public boolean encompasses(Plot plot)
	{
		boolean result;
		
		if(plot.x < this.x && plot.y < this.y && plot.width < this.width && plot.depth < this.depth )
		{	
			result = true;
		}
		else
			result = false;
		
		return result;
	}
	
	
	/**
	 * Method to check if one plot overlaps another plot
	 * @param plot
	 * @return
	 */
	public boolean overlaps(Plot plot)
	{
		boolean result = true;
		
		if(plot.x < this.x || this.y <plot.y)
		{	
			result = true;
		}
		 if(plot.x > this.x || this.y >plot.y)
		 {
			 result = true;
		 }
		return result;
	}
	
	
	/**
	 * toSting Method for Plot class
	 */
	public String toString()
	{
		return this.x +","+this.y +","+this.width +","+this.depth; 
	}

}
