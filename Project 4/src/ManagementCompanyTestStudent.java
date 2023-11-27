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
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {
	Property sampleProperty1;
	Property sampleProperty2;
	Property sampleProperty3;
	ManagementCompany mangementCo ; 

	@BeforeEach
	void setUp() throws Exception {
		mangementCo= new ManagementCompany("Railey", "10000",6);
	}

	@AfterEach
	void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	void testToString() {
		sampleProperty1 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",0,0,3,3);	
		sampleProperty2 = new Property ("Thayer Hall", "DC", 4500, "Sara Davids",5,0,8,3);
		assertEquals(0,mangementCo.addProperty(sampleProperty1));
		assertEquals(1,mangementCo.addProperty(sampleProperty2));
		String expectedString = "List of the properties for Railey, taxID: 10000\n"
				+ "______________________________________________________\n"
				+ "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
				+ "Thayer Hall,DC,Sara Davids,4500.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 7055.1";
		System.out.println(expectedString);
		System.out.println(mangementCo.toString());
		assertEquals(expectedString, mangementCo.toString());
	}

	@Test
	void testAddProperty1() {
		assertEquals(0,mangementCo.addProperty("Sunsational", "Beckman", 2613, "BillyBob Wilson"));
		
	}

	@Test
	void testAddProperty2() {
		assertEquals(0,mangementCo.addProperty("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,3,6,6));
		
	}

	@Test
	void testAddProperty3() {
		sampleProperty1 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",0,0,3,3);	
		sampleProperty2 = new Property ("Thayer Hall", "DC", 4500, "Sara Davids",5,0,8,3);
		sampleProperty3 = new Property ("E-way", "Silver Spring", 6452, "Wilson Owens",0,5,3,8);
		assertEquals(0,mangementCo.addProperty(sampleProperty1));
		assertEquals(1,mangementCo.addProperty(sampleProperty2));
		assertEquals(2,mangementCo.addProperty(sampleProperty3));
	
	}

	@Test
	void testGetTotalRent() {
		sampleProperty1 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",0,0,3,3);	
		sampleProperty2 = new Property ("Thayer Hall", "DC", 4500, "Sara Davids",5,0,8,3);
		sampleProperty3 = new Property ("E-way", "Silver Spring", 6452, "Wilson Owens",0,5,3,8);
		mangementCo.addProperty(sampleProperty3);
		mangementCo.addProperty(sampleProperty1);
		mangementCo.addProperty(sampleProperty2);
		assertEquals(13565,mangementCo.getTotalRent());
	}

	@Test
	void testGetHighestRentPropperty() {
		sampleProperty1 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",0,0,3,3);	
		sampleProperty2 = new Property ("Thayer Hall", "DC", 4500, "Sara Davids",5,0,8,3);
		sampleProperty3 = new Property ("E-way", "Silver Spring", 6452, "Wilson Owens",0,5,3,8);
		assertEquals(0,mangementCo.addProperty(sampleProperty1));
		assertEquals(1,mangementCo.addProperty(sampleProperty2));
		assertEquals(2,mangementCo.addProperty(sampleProperty3));
		assertEquals(sampleProperty3,mangementCo.getHighestRentPropperty());
	}

	@Test
	void testGetPropertiesCount() {
		sampleProperty1 = new Property ("E-way", "Silver Spring", 6452, "Wilson Owens",0,5,3,8);
		sampleProperty2 = new Property ("Thayer Hall", "DC", 4500, "Sara Davids",5,0,8,3);
		mangementCo.addProperty(sampleProperty1);
		mangementCo.addProperty(sampleProperty2);
		assertEquals(2,mangementCo.getPropertiesCount());
	}

	@Test
	void testIsMangementFeeValid() {
		
		assertTrue(mangementCo.isMangementFeeValid());
	}

}
