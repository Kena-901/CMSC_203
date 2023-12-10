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

class CoffeeTestStudent {
		Coffee test1,test2,test3;
	@BeforeEach
	void setUp() throws Exception {
		test1 = new Coffee("Latte", Size.MEDIUM,true, true);
		test2 = new Coffee("Americano", Size.MEDIUM,false, true);
		test3 = new Coffee("Latte", Size.MEDIUM,true, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		test1 = test2 = test3 = null;
	}

	@Test
	void testCalcPrice() {
		assertEquals(4,test1.calcPrice());
	}

	@Test
	void testEquals() {
		assertTrue(test1.equals(test3));
		assertFalse(test2.equals(test1));
	}

	@Test
	void testToString() {
		assertEquals("Latte, MEDIUM\n"
				+ " Extra shot of Coffee and Syrup added\n"
				+ " Price: 4.0",test1.toString());
	}

}
