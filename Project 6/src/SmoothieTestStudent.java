/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The BevShop offers 3 types of beverages: Coffee, Alcoholic and Smoothie. Beverages can 
 * 				be ordered in 3 different sizes: Small, medium, and large. All the beverage types have a 
 * 				base price. In addition, there are additional charges depending on the size and specific 
 * 				add-ons for each type of beverage. Create a Program to run the BevShop.
 * Due: 12/09/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Kenawak Abebe
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
	Smoothie test1 , test2 , test3;

	@BeforeEach
	void setUp() throws Exception {
		test1 = new Smoothie("House Special", Size.MEDIUM,4, true);
		test2 = new Smoothie("Detox", Size.MEDIUM,3, false);
		test3 = new Smoothie("House Special", Size.MEDIUM,4, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		test1 = test2 = test3 = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(6.5,test1.calcPrice());
	}

	@Test
	void testEquals() {
		assertTrue(test1.equals(test3));
		assertFalse(test2.equals(test1));
	}

	@Test
	void testToString() {
		assertEquals("House Special, MEDIUM\n"
				+ " Protein added to smoothie \n"
				+ " Number of Fruit: 4\n"
				+ " Price: 6.5",test1.toString());
	}

}
