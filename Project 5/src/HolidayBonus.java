/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Create a utility class that manipulates a two-dimensional 
 * 				ragged array of doubles. This utility class will be used to create a 
 * 				Sales Report for Retail District #5. 
 * 
 * 			-	Create a utility class that will calculate holiday bonuses given a ragged 
 * 				array of doubles which represent the sales for each store in each category.
 * Due: 11/27/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Kenawak Abebe
*/
public class HolidayBonus extends TwoDimRaggedArrayUtility{
	
	private static final double BONUS_1 = 5000;
	private static final double BONUS_2 = 2000;
	private static final double BONUS_3 = 1000;
	
	
	/**
	 * Calculates the holiday bonus for each store
	 * @param data  - the two dimensional array of store sales
	 * @return an array of the bonus for each store
	 */
	static double[] calculateHolidayBonus(double[][] data)
	{
		double [] bonus = new double[6];
		
		for(int x= 0; x < bonus.length; x++)
		{
			for(int i =0; i < data.length; i ++)
			{
				if(i < data[x].length)
				{
					if(x == getHighestInColumnIndex(data,i))
					{
						bonus[x]+=5000;
					}
					else if(x == getLowestInColumnIndex(data,i))
					{
						bonus[x]+=1000;
					}
					else
					{
						bonus[x]+=2000;
					}
				}
				else
					bonus[x]+=0;
				
			}
		}
			
		return bonus;
	}
	
	
	/**
	 * Calculates the total holiday bonuses
	 * @param data  - the two dimensional array of store sales
	 * @return the total of all holiday bonuses
	 */
	static double calculateTotalHolidayBonus(double[][] data)
	{
		double sum = 0;
		
		double [] hold = calculateHolidayBonus(data);
		
		for(int i =0; i < hold.length; i++)
		{
			sum+= hold[i];
		}
		
		return sum;
	}
}
