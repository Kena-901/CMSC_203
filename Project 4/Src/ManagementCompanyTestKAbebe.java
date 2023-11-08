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

class ManagementCompanyTestKAbebe {
	Property sampleProperty1;
	Property sampleProperty2;
	Property sampleProperty3;
	ManagementCompany mangementCo;
	
	@BeforeEach
	void setUp() throws Exception {
		mangementCo= new ManagementCompany("MGA llc", "35957563",7);
	}

	@AfterEach
	void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	void testToString() {
		sampleProperty1 = new Property ("Thayer Hall", "Sara Davidson", 2613, "Silver Spring",5,0,8,3);
		sampleProperty2 = new Property ("Sunsational", "Alen Tomas", 4595, "DC",0,5,3,8);
		assertEquals(0,mangementCo.addProperty(sampleProperty1));
		assertEquals(1,mangementCo.addProperty(sampleProperty2));
			
		String expectedString = "List of the properties for MGA llc, taxID: 35957563\n"
				+ "______________________________________________________\n"
				+ "Thayer Hall,Sara Davidson,Silver Spring,2613.0\n"
				+ "Sunsational,Alen Tomas,DC,4595.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 8404.7145";
		System.out.println(expectedString);
		System.out.println(mangementCo.toString());
		assertEquals(expectedString, mangementCo.toString());
	}

	@Test
	void testAddPropertyString1() {
		 assertEquals(0,mangementCo.addProperty("Thayer Hall", "Sara Davidson", 2613, "Silver Spring"));
	}

	@Test
	void testAddProperty2() {
		assertEquals(0,mangementCo.addProperty("Thayer Hall", "Sara Davidson", 2613, "Silver Spring",5,0,8,3));
	}

	@Test
	void testAddProperty3() {
		sampleProperty1 = new Property ("Thayer Hall", "Sara Davidson", 2613, "Silver Spring",5,0,8,3);
		sampleProperty2 = new Property ("Sunsational", "Alen Tomas", 4595, "DC",0,5,3,8);
		sampleProperty3 = new Property ("Hamilton", "Owen Beckman", 34567, "Rockville",0,0,3,3);
		assertEquals(0,mangementCo.addProperty(sampleProperty1));
		assertEquals(1,mangementCo.addProperty(sampleProperty1));
		assertEquals(2,mangementCo.addProperty(sampleProperty1));
	}

	@Test
	void testGetTotalRent() {
		sampleProperty1 = new Property ("Thayer Hall", "Sara Davidson", 2613, "Silver Spring",5,0,8,3);
		sampleProperty2 = new Property ("Sunsational", "Alen Tomas", 4595, "DC",0,5,3,8);
		sampleProperty3 = new Property ("Hamilton", "Owen Beckman", 34567, "Rockville",0,0,3,3);
		mangementCo.addProperty(sampleProperty1);
		mangementCo.addProperty(sampleProperty2);
		mangementCo.addProperty(sampleProperty3);
		assertEquals(41775,mangementCo.getTotalRent());
	}

	@Test
	void testGetHighestRentPropperty() {
		sampleProperty1 = new Property ("Thayer Hall", "Sara Davidson", 2613, "Silver Spring",5,0,8,3);
		sampleProperty2 = new Property ("Sunsational", "Alen Tomas", 4595, "DC",0,5,3,8);
		sampleProperty3 = new Property ("Hamilton", "Owen Beckman", 34567, "Rockville",0,0,3,3);
		mangementCo.addProperty(sampleProperty1);
		mangementCo.addProperty(sampleProperty2);
		mangementCo.addProperty(sampleProperty3);
		assertEquals(sampleProperty3,mangementCo.getHighestRentPropperty());
	}

	@Test
	void testGetPropertiesCount() {
		sampleProperty1 = new Property ("Thayer Hall", "Sara Davidson", 2613, "Silver Spring",5,0,8,3);
		sampleProperty2 = new Property ("Sunsational", "Alen Tomas", 4595, "DC",0,5,3,8);
		sampleProperty3 = new Property ("Hamilton", "Owen Beckman", 34567, "Rockville",0,0,3,3);
		assertEquals(0,mangementCo.addProperty(sampleProperty1));
		assertEquals(1,mangementCo.addProperty(sampleProperty2));
		assertEquals(2,mangementCo.addProperty(sampleProperty3));
		assertEquals(3,mangementCo.getPropertiesCount());
	}

	@Test
	void testIsMangementFeeValid() {
		assertTrue(mangementCo.isMangementFeeValid());
	}

}
