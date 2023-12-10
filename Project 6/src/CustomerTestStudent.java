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

class CustomerTestStudent {
	Customer test;

	@BeforeEach
	void setUp() throws Exception {
		test = new Customer("Dave", 21);
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
	}

	@Test
	void testToString() {
		assertEquals("Customer name= Dave\n"
						+ " age= 21", test.toString());
	}

}
