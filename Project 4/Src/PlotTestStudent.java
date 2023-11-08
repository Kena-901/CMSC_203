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
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plot1, plot2;
	
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot2 = new Plot(3, 4, 4, 3);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot2 = null;
	}
	
	@Test
	void testOverlaps() {
		assertTrue(plot1.overlaps(plot2));
	}

	@Test
	void testToString() {
		assertEquals("3,4,4,3",plot2.toString());
	}

}
