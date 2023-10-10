import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook student1,student2;

	@BeforeEach
	void setUp() throws Exception 
	{
		student1 = new GradeBook(5);
		student2 = new GradeBook(5);
		
		student1.addScore(89);
		student1.addScore(78);
		student1.addScore(83);
				
		
		student2.addScore(99);
		student2.addScore(88);
		student2.addScore(73);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		student1 = null;
		student2 = null;
	}

	@Test
	void testGetScoreSize() {
		assertEquals(3,student1.getScoreSize());
	}

	@Test
	void testAddScore() {
		assertTrue(student1.toString().equals("89.0 78.0 83.0 0.0 0.0 "));
		
	}

	@Test
	void testSum() {
		assertEquals(260, student2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(73, student2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(187, student2.finalScore());
	}

	@Test
	void testToString() {
		assertEquals("89.0 78.0 83.0 0.0 0.0 ", student1.toString());
	}

}
