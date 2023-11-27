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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

	File test = new File("test.txt");
	double [] [] data= {{4,5,6}, 
						{4,8,5,9,1,4},
						{2,4,6,8},
						{5,4,3,5,7,1},
						{3,6,3,1,3},
						{1,5}};

	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	
	}

	@Test
	void testGetAverage() {
		assertEquals(4.346, TwoDimRaggedArrayUtility.getAverage(data),.001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(5, TwoDimRaggedArrayUtility.getColumnTotal(data,5),.001);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(9, TwoDimRaggedArrayUtility.getHighestInArray(data),.001);
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(4, TwoDimRaggedArrayUtility.getHighestInColumn(data,5),.001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(data,5),.001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(5, TwoDimRaggedArrayUtility.getHighestInRow(data,5),.001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(data,5),.001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInArray(data),.001);
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumn(data,5),.001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(5, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,0),.001);
		assertEquals(3, TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,5),.001);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(4, TwoDimRaggedArrayUtility.getLowestInRow(data,0),.001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(data,0),.001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(15,TwoDimRaggedArrayUtility.getRowTotal(data,0),.001);
	}

	@Test
	void testGetTotal() {
		assertEquals(113,TwoDimRaggedArrayUtility.getTotal(data),.001);
	}
	
	@Test
	void testWriteToFileAndReadFile() throws IOException {
		TwoDimRaggedArrayUtility.writeToFile(data,test);
		assertArrayEquals(data,TwoDimRaggedArrayUtility.readFile(test));
	}
}
