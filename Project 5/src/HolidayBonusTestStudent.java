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

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {
	double [] [] data= {{4,5,6}, 
						{3,8,5,9,1,4},
						{2,1,4,8},
						{5,4,3,5,7,1},
						{6,6,1,1,3},
						{1,3}};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculateHolidayBonus() {
		assertEquals(9000, HolidayBonus.calculateHolidayBonus(data)[0],.001);
		assertEquals(20000, HolidayBonus.calculateHolidayBonus(data)[1],.001);
		assertEquals(7000, HolidayBonus.calculateHolidayBonus(data)[2],.001);
		assertEquals(14000, HolidayBonus.calculateHolidayBonus(data)[3],.001);
		assertEquals(11000, HolidayBonus.calculateHolidayBonus(data)[4],.001);
		assertEquals(3000, HolidayBonus.calculateHolidayBonus(data)[5],.001);
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(64000, HolidayBonus.calculateTotalHolidayBonus(data),.001);
	}

}
